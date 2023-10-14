package com.example.CEIRproject.dto;
public class OwnerPersInfo{

    private String ownerName;
    private String address;
    private String uploadIdentity;
    private long identityNumber;
    private String emailId;
    private long mobileNoForOTP;

    public String getOwnerName() {

        return ownerName;
    }

    public void setOwnerName(String ownerName) {

        this.ownerName = ownerName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getUploadIdentity() {

        return uploadIdentity;
    }

    public void setUploadIdentity(String uploadIdentity) {
        this.uploadIdentity = uploadIdentity;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getMobileNoForOTP() {
        return mobileNoForOTP;
    }

    public void setMobileNoForOTP(long mobileNoForOTP) {
        this.mobileNoForOTP = mobileNoForOTP;
    }


}