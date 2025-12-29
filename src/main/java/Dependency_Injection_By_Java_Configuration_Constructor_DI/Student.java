package Dependency_Injection_By_Java_Configuration_Constructor_DI;

public class Student {

    private  int rollNo;
    private  String name;
    private  Address address;

    public Student(int rollNo, String name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public  void displayInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + rollNo);
        System.out.println("Student Address: " + address);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + rollNo + ", address=" + address + "]";
    }

}
