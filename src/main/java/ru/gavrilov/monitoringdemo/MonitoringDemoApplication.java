package ru.gavrilov.monitoringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MonitoringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoringDemoApplication.class, args);
    }

    @GetMapping("/")
    public ResponseEntity<String> greeting() {
        System.out.println("world");
        return ResponseEntity.ok("Hello World!!!");
    }

    @GetMapping("/menkent")
    public ResponseEntity<String> greetingMenkent() {
        System.out.println("menkent");
        return ResponseEntity.ok("Hello Menkent!!!");
    }


}
