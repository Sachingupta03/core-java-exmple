package com.sachin.Operators.StaticDemo;

public class City {

    String houseNo;
    String Location;
    String City;
    int PinCodeNo;
    String dist;

    @Override
    public String toString() {
        return "City{" +
                "houseNo='" + houseNo + '\'' +
                ", Location='" + Location + '\'' +
                ", City='" + City + '\'' +
                ", PinCodeNo=" + PinCodeNo +
                ", dist='" + dist + '\'' +
                '}';
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPinCodeNo() {
        return PinCodeNo;
    }

    public void setPinCodeNo(int pinCodeNo) {
        PinCodeNo = pinCodeNo;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }
}



