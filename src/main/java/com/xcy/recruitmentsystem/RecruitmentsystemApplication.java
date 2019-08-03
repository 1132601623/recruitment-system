package com.xcy.recruitmentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
public class RecruitmentsystemApplication {

  public static void main(String[] args) {
    SpringApplication.run(RecruitmentsystemApplication.class, args);
  }


  @Bean
  public MultipartResolver getmultipartResolver(){
    MultipartResolver multipartResolver = new CommonsMultipartResolver();
    return multipartResolver;
  }
}
