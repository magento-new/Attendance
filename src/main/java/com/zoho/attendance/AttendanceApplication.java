package com.zoho.attendance;

/*import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendanceApplication {

public static void main(String[] args) {
SpringApplication.run(AttendanceApplication.class, args);
}

}*/

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages="com.*")
public class AttendanceApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AttendanceApplication.class, args);
    }

}