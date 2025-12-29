package Dependency_Injection_By_Java_Configuration_Constructor_DI;

public class Address {
    private int HouseNo;
    private String City;
    private int PinCode;

    public Address(int houseNo, String city, int pinCode) {
        HouseNo = houseNo;
        City = city;
        PinCode = pinCode;
    }
    @Override
    public String toString() {
        return HouseNo + ", " + City + ", " + PinCode;
    }


}
