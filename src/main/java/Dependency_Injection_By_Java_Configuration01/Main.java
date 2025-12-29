package Dependency_Injection_By_Java_Configuration01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig_File.class);

        Student std=context.getBean(Student.class);
        std.displayInfo();


    }
}
