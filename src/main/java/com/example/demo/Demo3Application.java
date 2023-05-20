package com.example.demo;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Todo : Dockerdaa postgresql kaldırılarak yapılacak(Docker compose dosyası yazılacak)

@EnableRabbit
@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo3Application.class, args);

    }


}



