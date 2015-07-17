package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan
@RestController
public class MainApp {
    @Value("${bar:World!}")
    String bar;
    @Autowired Environment springEnv;
    @RequestMapping("/")
    String hello() {
        System.out.println(springEnv);
        return "Hello " + bar + "!";
    }



    public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);
    }
}
