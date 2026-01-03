package ComponentScan_Annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ComponentScan_Annotation")
public class AppConfig {

}
