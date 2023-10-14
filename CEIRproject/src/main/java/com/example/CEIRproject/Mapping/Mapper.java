package com.example.CEIRproject.Mapping;

import com.example.CEIRproject.dto.Blocking;
import com.example.CEIRproject.dto.CheckStatus;
import com.example.CEIRproject.dto.InternalRequest;
import com.example.CEIRproject.dto.Unblocking;
import org.springframework.stereotype.Repository;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

@Repository
public class Mapper {

    public InternalRequest mapBlockingToInternalRequest(Blocking blocking) {
        InternalRequest request = new InternalRequest();
        request.setRequestId(getRandomNum());
        //device info
        request.setMobileNumber1(blocking.getDeviceInfo().getMobileNumber1());
        request.setImei1(blocking.getDeviceInfo().getiMEI1());
        request.setMobileNoForOTP(blocking.getOwnerInfo().getMobileNoForOTP());
        return request;
    }

    public long getRandomNum(){
        Random r = new Random();
       return r.nextInt(999999999);
    }
    public InternalRequest mapUnblockingToInternalRequest(Unblocking unblocking){
        InternalRequest request1 = new InternalRequest();
        request1.setReasonForUnblocking(unblocking.getReasonForUnblocking());
        request1.setRequestId(getRandomNum());
        request1.setMobileNoForOTP(request1.getMobileNoForOTP());
        request1.setMobileNumber1(request1.getMobileNumber1());
        return request1;
    }
    public InternalRequest mapCheckStatusToInternalRequest(CheckStatus checkStatus){
        InternalRequest request2 = new InternalRequest();
        request2.setRequestId(request2.getRequestId());
        return request2;
    }
}
