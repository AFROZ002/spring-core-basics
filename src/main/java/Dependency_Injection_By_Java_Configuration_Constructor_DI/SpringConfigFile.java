package Dependency_Injection_By_Java_Configuration_Constructor_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddrObj(){

        Address addr=new Address(83,"Mirjumla",560059);
        return addr;




    }

    @Bean
    public Student createStudentObj(){
        Student stu=new Student(8,"Alam Bhai",createAddrObj());
        return stu;
    }


}
