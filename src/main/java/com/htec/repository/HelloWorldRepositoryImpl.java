package com.htec.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepositoryImpl implements HelloWorldRepository{
    @Override
    public String fetchHelloWorld() {
        return "Hello world!";
    }
}
