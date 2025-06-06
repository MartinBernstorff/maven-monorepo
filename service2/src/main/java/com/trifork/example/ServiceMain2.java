package com.trifork.example;

public class ServiceMain2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static String getGreeting() {
        return LibMain.getGreeting();
    }
}