package com.htec.service;

import com.htec.domain.model.Counter;
import com.htec.repository.CounterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CounterServiceImpl implements CounterService {

    private final CounterRepository counterRepository;

    @Override
    public Counter fetchCounter() {
        return counterRepository.findAll().stream().findFirst().orElse(new Counter());
    }

    @Override
    public void updateCounter() {
        Counter counterToBeUpdated = this.fetchCounter();
        counterToBeUpdated.incrementValue();
        counterRepository.save(counterToBeUpdated);
    }
}
