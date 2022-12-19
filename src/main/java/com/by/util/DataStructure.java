package com.by.util;


import java.util.Arrays;

public class DataStructure {

    public static void main(String[] args) {
        arrays();
    }

    public static void arrays() {
        int[] ints = new int[]{1, 2, 3, 4};
        ints[0] = ints[2];
        System.out.println(Arrays.toString(ints));
    }
}
