package com.by.algorithm;

public class Reverse {

    public static void main(String[] args) {
        String data = "aaabBvcbbaaa";
        boolean isReverse = isReverse(data);
        System.out.println("reverse data is "+ isReverse);
    }

    private static boolean isReverse(String data) {
        return new StringBuilder(data).reverse().toString().equalsIgnoreCase(data);

    }
}
