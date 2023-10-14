package com.example.CEIRproject.dto;

public class UnblockingRequest {
    private long mobileNumber1;
    private long imei1;
    private long mobileNoForOTP;
    private DeviceInformation deviceInfo;

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

    public DeviceInformation getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInformation deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
}
