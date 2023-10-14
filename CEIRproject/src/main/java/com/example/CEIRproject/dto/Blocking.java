package com.example.CEIRproject.dto;

public class Blocking {
    private int requestId;
    private DeviceInformation deviceInfo;
    private LostInformation lostInfo;
    private OwnerPersInfo ownerInfo;

    public DeviceInformation getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(DeviceInformation deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public LostInformation getLostInfo() {
        return lostInfo;
    }

    public void setLostInfo(LostInformation lostInfo) {
        this.lostInfo = lostInfo;
    }

    public OwnerPersInfo getOwnerInfo() {
        return ownerInfo;
    }

    public void setOwnerInfo(OwnerPersInfo ownerInfo) {
        this.ownerInfo = ownerInfo;
    }



    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }


    public Blocking(DeviceInformation deviceInfo, LostInformation lostInfo, OwnerPersInfo ownerInfo) {
        this.deviceInfo = deviceInfo;
        this.lostInfo = lostInfo;
        this.ownerInfo = ownerInfo;
    }

    public Blocking() {
    }

    public static void main(String[] args) {
        DeviceInformation deviceInfo = new DeviceInformation();
        LostInformation lostInfo = new LostInformation();
        OwnerPersInfo ownerInfo = new OwnerPersInfo();

        Blocking blocking = new Blocking(deviceInfo, lostInfo, ownerInfo);

    }
}
