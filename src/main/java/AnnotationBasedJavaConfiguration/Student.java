package AnnotationBasedJavaConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
@Value("Mahesh Ganjaswag")
    private  String name;
@Value("008")
    private  int RollNo;
@Value("alamBhai@gmail.com")
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

