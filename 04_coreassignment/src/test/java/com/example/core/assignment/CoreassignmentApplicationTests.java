package com.example.core.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.core.assignment.services.CalculatorService;

@SpringBootTest
class CoreassignmentApplicationTests {

    @Autowired
    private CalculatorService service;

    @Test
    void testDependencyInjection() {
        assertEquals(5, service.sumOfTwoNumbers(2, 3));
    }

}
