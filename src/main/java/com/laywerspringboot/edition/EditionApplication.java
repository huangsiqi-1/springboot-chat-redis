package com.laywerspringboot.edition;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages={"com.laywerspringboot.**"})
////annotationClass = Repository.class,
//@MapperScan(basePackages = "com.laywerspringboot.edition.dao")
@SpringBootApplication
@MapperScan(basePackages = "com.laywerspringboot.edition.dao")
public class EditionApplication {

    public static void main(String[] args) {
        SpringApplication.run(EditionApplication.class, args);
    }

}