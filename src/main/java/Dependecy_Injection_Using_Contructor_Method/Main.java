package Dependecy_Injection_Using_Contructor_Method;

import Dependency_Injection01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        Dependency_Injection01.Student std = (Student) context.getBean("student1");
        std.displayStudentInfo();

    }
}
