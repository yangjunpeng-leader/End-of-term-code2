package com.example.Eight;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/example/Eight/mapper")
public class EndOfTermCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndOfTermCodeApplication.class, args);
    }

}
