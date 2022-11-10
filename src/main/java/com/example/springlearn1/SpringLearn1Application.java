package com.example.springlearn1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.springlearn1.Dao")

public class SpringLearn1Application {

  public static void main(String[] args) {

    SpringApplication.run(SpringLearn1Application.class, args);
  }

}
