package JavaBasedConfiguration;

public class Student {
   private  String name;
   private  int RollNo;
   private String Email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    void displayInfo(){
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll No: "+RollNo);
        System.out.println("Student Email: "+Email);
    }
}
