package AutoWiringWithJavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig_File {

    @Bean
    public Address address() {
        Address addr = new Address();
        addr.setHouseNo(83);
        addr.setCity("Mirjumla");
        addr.setPinCode(560059);
        return addr;
    }

    // 🔥 AUTOWIRING HAPPENS HERE
    @Bean
    public Student student(Address address) {
        Student stu = new Student();
        stu.setName("Alam Bhai");
        stu.setAge(26);

        // Spring khud address bean inject karega
//        stu.setAddress(address);

        return stu;
    }
}
