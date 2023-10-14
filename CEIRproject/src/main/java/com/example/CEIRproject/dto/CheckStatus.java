package com.example.CEIRproject.dto;

public class CheckStatus {
    private String currentStatus;
    private long requestID;
    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }


    public long getRequestID(){
        return requestID;
    }
    public void setRequestID(long requestID){
        this.requestID = requestID;

    }
}
