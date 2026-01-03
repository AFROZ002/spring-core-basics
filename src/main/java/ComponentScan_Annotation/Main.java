package ComponentScan_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = context.getBean(Employee.class); // ✅ BEST PRACTICE

        System.out.println(emp);
    }
}
