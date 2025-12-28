package Alam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        Student st1 = (Student) context.getBean("mystudent1");
        st1.displayInfo();
    }
}
