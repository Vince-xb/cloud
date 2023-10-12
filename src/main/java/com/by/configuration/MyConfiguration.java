package com.by.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.yml")
@ConfigurationProperties(prefix = "data")
public class MyConfiguration {

    @Value("${data}")
    private String data;
    @Value("${location}")
    private String location;

    @Bean
    public void setData(){
        System.out.println("data:"+this.data+",location:"+this.location);
    }

}
