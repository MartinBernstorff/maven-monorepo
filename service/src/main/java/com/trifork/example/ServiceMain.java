package com.trifork.example;

public class ServiceMain {
    public static void main(String[] args) {
        System.out.println("Hello, Worlds!");
    }

    public static String getGreeting() {
        return LibMain.getGreeting();
    }
}