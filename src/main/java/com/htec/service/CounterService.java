package com.htec.service;

import com.htec.domain.model.Counter;

public interface CounterService {
    Counter fetchCounter();
    void updateCounter();
}
