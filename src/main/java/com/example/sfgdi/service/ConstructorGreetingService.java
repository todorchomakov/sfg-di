package com.example.sfgdi.service;

public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, World! (Constructor)";
    }
}
