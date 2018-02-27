package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class SpringTestPropFileApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringTestPropFileApplication.class)) {
            SomeExternalService externalService = applicationContext.getBean(SomeExternalService.class);

            System.out.println(externalService);

            System.out.println("URL: " + externalService.getUrl());
        }

    }

}
