package demo;

/**
 * Created by aizhantoregozhina on 7/15/15.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableConfigServer
@ComponentScan
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}