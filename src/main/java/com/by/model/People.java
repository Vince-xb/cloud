package com.by.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class People extends Object implements CanEat, CanSleep {

    String name;

    int phone;

    public void SayHello(){
        System.out.println("hello");
    }

}
