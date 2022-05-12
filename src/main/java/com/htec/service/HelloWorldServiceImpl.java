package com.htec.service;

import com.htec.repository.HelloWorldRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloWorldServiceImpl implements HelloWorldService{

    private final HelloWorldRepository helloWorldRepository;

    @Override
    public String getHelloWorld() {
        return helloWorldRepository.fetchHelloWorld();
    }
}
