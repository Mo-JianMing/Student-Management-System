package com.mj.temp_crud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/mj/temp_crud/dao")
public class TempCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TempCrudApplication.class, args);
    }

}
