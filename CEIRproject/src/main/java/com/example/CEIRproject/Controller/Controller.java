package com.example.CEIRproject.Controller;


import com.example.CEIRproject.dto.Blocking;
import com.example.CEIRproject.Mapping.Mapper;
import com.example.CEIRproject.dto.CheckStatus;
import com.example.CEIRproject.dto.InternalRequest;
import com.example.CEIRproject.dto.Unblocking;
import com.example.CEIRproject.service.CeirService;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/requests")
public class Controller {
    @Autowired
    Mapper mapper;
    @Autowired
    CeirService ceirService;

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @PostMapping("/block")
    public String blockDevice(@RequestBody Blocking blocking) {
        try {
            if (blocking != null && blocking.getDeviceInfo() != null && blocking.getLostInfo() != null && blocking.getOwnerInfo() != null) {
                InternalRequest internalReq = mapper.mapBlockingToInternalRequest(blocking);
                ceirService.save(internalReq);
                return ("Device blocked successfully with RequestId :" + internalReq.getRequestId());
            } else {
                logger.error("Invalid Request");
                return "Invalid Request";
            }
        } catch(Exception ex){
            ex.getStackTrace();
            return "Exception occured : "+ex.getMessage();
        }
    }

    @PostMapping(value = "/checkStatus")
    public ResponseEntity<Blocking> checkStatusOfDevice(@RequestBody CheckStatus checkStatus ){

        Blocking blocking = ceirService.checkStatusOfDevice(checkStatus.getRequestID());

        return new ResponseEntity<Blocking>(blocking, HttpStatus.OK);
    }

    @PostMapping(value = "/unblock")
    public String unblockDevice(@RequestBody Unblocking unblocking){
        if(unblocking!=null && unblocking.getReasonForUnblocking()!=null){
            InternalRequest internalReq1 = mapper.mapUnblockingToInternalRequest(unblocking);
            ceirService.delete(internalReq1);
            return ("Device unblocked successfully!");
        }
        else{
            return "Invalid Request";
        }
    }

    }


