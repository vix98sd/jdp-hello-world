package com.htec.repository;

public interface HelloWorldRepository {
    default String fetchHelloWorld(){
        return "Hello world!";
    }
}
