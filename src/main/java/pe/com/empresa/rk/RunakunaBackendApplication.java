package pe.com.empresa.rk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties
@EnableScheduling
@EnableCaching
public class RunakunaBackendApplication {


    public static void main(String[] args) {
    	
    	SpringApplication.run(RunakunaBackendApplication.class, args);

    }



}