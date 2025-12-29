package Dependency_Injection_By_Java_Configuration01;

public class Address {
    private int HouseNo;
    private String City;
    private int PinCode;


    public int getHouseNo() {
        return HouseNo;
    }

    public void setHouseNo(int houseNo) {
        HouseNo = houseNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }


    @Override
    public String toString() {
        return  HouseNo + ", " +City + ", " + PinCode;
    }
}
