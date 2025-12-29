package Dependency_Injection_By_Java_Configuration01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig_File {
    @Bean
    public  Address CreateAddrObj(){

        Address addr = new Address();
        addr.setHouseNo(83);
        addr.setCity("Mirjumla");
        addr.setPinCode(560059);

        return addr;
    }
@Bean
    public  Student CreateStudentObj(){
       Student stu=new Student();
       stu.setName("Alam Bhai");
       stu.setAge(26);
       stu.setAddress(CreateAddrObj());


        return stu;
    }


}
