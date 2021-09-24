package co.com.pragma.api.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableMongoAuditing
@EnableScheduling
@SpringBootApplication
public class ApiUsersApplication {
   public static void main(String[] args) {
      SpringApplication.run(ApiUsersApplication.class, args);
   }
}