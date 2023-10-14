package com.example.CEIRproject.dto;

public class LostInformation{

    private String lostPlace;
    private String lostDate;
    private String state;
    private String district;
    private String policeStation;
    private long policeComplaintNumber;

    public String getLostPlace() {

        return lostPlace;
    }

    public void setLostPlace(String lostPlace) {

        this.lostPlace = lostPlace;
    }

    public String getLostDate() {
        return lostDate;
    }

    public void setLostDate(String lostDate) {

        this.lostDate = lostDate;
    }

    public String getState() {

        return state;
    }

    public void setState(String State) {

        State = State;
    }

    public String getDistrict() {

        return district;
    }

    public void setDistrict(String District) {

        District = District;
    }

    public String getPoliceStation() {

        return policeStation;
    }

    public void setPoliceStation(String PoliceStation) {

        PoliceStation = PoliceStation;
    }

    public long getPoliceComplaintNumber() {

        return policeComplaintNumber;
    }

    public void setPoliceComplaintNumber(long policeComplaintNumber) {

        this.policeComplaintNumber = policeComplaintNumber;
    }


}