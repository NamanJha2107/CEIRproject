package com.example.CEIRproject.dto;

public class Unblocking {
    private long requestID;
    private long mobileNumber1;
    private String reasonForUnblocking;
    private long mobileNoForOTP;
    public long getRequestID() {

        return requestID;
    }

    public void setRequestID(long requestID) {

        this.requestID = requestID;
    }

    public long getMobileNumber1() {

        return mobileNumber1;
    }

    public void setMobileNumber1(long mobileNumber1) {

        this.mobileNumber1 = mobileNumber1;
    }

    public String getReasonForUnblocking() {
        return reasonForUnblocking;
    }

    public void setReasonForUnblocking(String reasonForUnblocking) {

        this.reasonForUnblocking = reasonForUnblocking;
    }

    public long getMobileNoForOTP() {

        return mobileNoForOTP;
    }

    public void setMobileNoForOTP(long mobileNoForOTP) {

        this.mobileNoForOTP = mobileNoForOTP;
    }


}
