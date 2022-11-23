package com.day8.composition;

public class Address {
    private String houseNo;
    private String addressLine;
    private String pinCode;

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Address(String houseNo, String addressLine, String pinCode) {
        this.houseNo = houseNo;
        this.addressLine = addressLine;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("houseNo='").append(houseNo).append('\'');
        sb.append(", addressLine='").append(addressLine).append('\'');
        sb.append(", pinCode='").append(pinCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
