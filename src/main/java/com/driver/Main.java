package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("Sam");
        String name= obj.getName();
        System.out.print(name);
    }//error cannot find Symbol
}