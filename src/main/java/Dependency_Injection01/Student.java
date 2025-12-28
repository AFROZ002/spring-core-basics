package Dependency_Injection01;

public class Student {
    private  int rollNo;
    private String name;
    private  Addess address;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Addess getAddress() {
        return address;
    }

    public void setAddress(Addess address) {
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
