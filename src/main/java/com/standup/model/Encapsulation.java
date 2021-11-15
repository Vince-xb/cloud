package com.standup.model;

public class Encapsulation {

    public static void main(String[] args) {
        People bob = new People();
        bob.setName("bob").setPhone(110);

        introduce(bob);
    }

    private static void introduce(People people){
        people.SayHello();
        System.out.println("I 'm"+people.getName());
        System.out.println("My phone is"+people.getPhone());
    }
}
