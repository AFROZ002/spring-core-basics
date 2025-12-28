package Dependency_Injection01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        Student std = (Student) context.getBean("student1");
        std.displayStudentInfo();

    }
}
