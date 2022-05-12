package com.htec.service;

import com.htec.repository.HelloWorldRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloWorldServiceImpl implements HelloWorldService{

    private final HelloWorldRepository helloWorldRepository;
    private final CounterService counterService;

    @Override
    public String getHelloWorld() {
        counterService.updateCounter();
        return helloWorldRepository.fetchHelloWorld() + " "
                + counterService.fetchCounter().toString();
    }
}
