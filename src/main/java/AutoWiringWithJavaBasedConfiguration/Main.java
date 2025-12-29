package AutoWiringWithJavaBasedConfiguration;

import Dependency_Injection_By_Java_Configuration01.SpringConfig_File;
import Dependency_Injection_By_Java_Configuration01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig_File.class);

        Dependency_Injection_By_Java_Configuration01.Student std=context.getBean(Student.class);
        std.displayInfo();



    }
}
