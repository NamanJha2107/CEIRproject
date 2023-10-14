package com.example.CEIRproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InternalRequest {
    @Id
    private long requestId;
    private long mobileNumber1;
    private long imei1;
    private long mobileNoForOTP;
    private String ReasonForUnblocking;
    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public String getReasonForUnblocking() {
        return ReasonForUnblocking;
    }

    public void setReasonForUnblocking(String reasonForUnblocking) {
        ReasonForUnblocking = reasonForUnblocking;
    }
    public long getMobileNumber1() {
        return mobileNumber1;
    }

    public void setMobileNumber1(long mobileNumber1) {
        this.mobileNumber1 = mobileNumber1;
    }

    public long getImei1() {
        return imei1;
    }

    public void setImei1(long imei1) {
        this.imei1 = imei1;
    }

    public long getMobileNoForOTP() {
        return mobileNoForOTP;
    }

    public void setMobileNoForOTP(long mobileNoForOTP) {
        this.mobileNoForOTP = mobileNoForOTP;
    }


}
