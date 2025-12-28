package JavaBasedConfiguration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public  class SpringConfig {
    @Bean
    public  Student stdId1(){

        Student std=new Student();
        std.setName("Afroz Alam");
        std.setRollNo(101);
        std.setEmail("afrozcpr@gmail.com");
        return std;




    }


}