package com.example.CEIRproject.service;

import com.example.CEIRproject.Repository.InformationRepository;
import com.example.CEIRproject.dto.Blocking;
import com.example.CEIRproject.dto.DeviceInformation;
import com.example.CEIRproject.dto.InternalRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CeirService {

    @Autowired
    private InformationRepository ceirRepository;

    public void save(InternalRequest request){

        ceirRepository.save(request);
    }
    public void delete(InternalRequest request){

        ceirRepository.delete(request);
    }

    public Blocking checkStatusOfDevice(long requestId){

        Blocking blockingResponse = null;

        Optional<InternalRequest> response = ceirRepository.findById(requestId);

       if(response.isPresent()){
           InternalRequest internalRequest = response.get();

           /* TODO : ADD IN MAPPER*/
           blockingResponse = new Blocking();

           DeviceInformation deviceInformation = new DeviceInformation();
           deviceInformation.setMobileNumber1(internalRequest.getMobileNumber1());
           deviceInformation.setiMEI1(internalRequest.getImei1());
           blockingResponse.setDeviceInfo(deviceInformation);
       }

       return blockingResponse ;
    }

}
