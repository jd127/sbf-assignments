package com.example.core.assignment.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

}
