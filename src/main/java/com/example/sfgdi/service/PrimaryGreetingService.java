package com.example.sfgdi.service;

public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, World! (Primary Bean)";
    }
}
