package Dependecy_Injection_Using_Contructor_Method;

import Dependency_Injection01.Addess;

public class Student {
    private  int rollNo;
    private String name;
    private Addess address;

    public Student(int rollNo, String name, Addess address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
    public  void displayStudentInfo(){
        System.out.println("Student Roll No: "+rollNo);
        System.out.println("Student Name: "+name);
        System.out.println("Student Address: "+address);
//        System.out.println("House No: "+address.getHouseNo());
//        System.out.println("City: "+address.getCity());
//        System.out.println("Pin Code: "+address.getPinCode());
    }
}

