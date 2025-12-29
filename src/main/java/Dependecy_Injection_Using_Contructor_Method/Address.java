package Dependecy_Injection_Using_Contructor_Method;

public class Address {
    private int houseNo;
    private String city;
    private  int pinCode;

    public Address(int houseNo, String city, int pinCode) {
        this.houseNo = houseNo;
        this.city = city;
        this.pinCode = pinCode;
    }
    public  String toString(){
        return houseNo+", "+city+", "+pinCode;
    }
}
