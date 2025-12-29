package Dependency_Injection_By_Java_Configuration_Constructor_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student std=context.getBean(Student.class);
        std.displayInfo();
    }
}
