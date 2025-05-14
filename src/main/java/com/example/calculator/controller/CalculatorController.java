package com.example.calculator.controller;

import com.example.calculator.dto.OperationRequest;
import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/add")
    public int add(@RequestBody OperationRequest request) {
        return calculatorService.add(request.getA(), request.getB());
    }

    @PostMapping("/subtract")
    public int subtract(@RequestBody OperationRequest request) {
        return calculatorService.subtract(request.getA(), request.getB());
    }

    @PostMapping("/multiply")
    public int multiply(@RequestBody OperationRequest request) {
        return calculatorService.multiply(request.getA(), request.getB());
    }

    @PostMapping("/divide")
    public double divide(@RequestBody OperationRequest request) {
        return calculatorService.divide(request.getA(), request.getB());
    }


}
