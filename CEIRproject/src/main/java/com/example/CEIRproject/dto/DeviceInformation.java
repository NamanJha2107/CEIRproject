package com.example.CEIRproject.dto;

public class DeviceInformation{
    private long mobileNumber1;
   private long mobileNumber2;
    private long iMEI1;
    private long iMEI2;
    private String deviceBrand;
    private String deviceModel;


    public long getMobileNumber1() {
        return mobileNumber1;
    }

    public void setMobileNumber1(long mobileNumber1) {
        this.mobileNumber1 = mobileNumber1;
    }


    public long getMobileNumber2() {
        return mobileNumber2;
    }

    public void setMobileNumber2(long mobileNumber2) {
        this.mobileNumber2 = mobileNumber2;
    }

    public long getiMEI1() {
        return iMEI1;
    }

    public void setiMEI1(long iMEI1) {
        this.iMEI1 = iMEI1;
    }

    public long getiMEI2() {
        return iMEI2;
    }

    public void setiMEI2(long iMEI2) {
        this.iMEI2 = iMEI2;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }


}