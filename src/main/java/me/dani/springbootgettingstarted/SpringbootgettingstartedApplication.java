package me.dani.springbootgettingstarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;

@SpringBootApplication
public class SpringbootgettingstartedApplication {

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(SpringbootgettingstartedApplication.class);
        app.addListeners(new SampleListener());
        app.run(args);
        // SpringApplication.run(SpringApplication.class,args);

    }

}
