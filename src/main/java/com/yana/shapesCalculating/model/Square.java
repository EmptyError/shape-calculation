package com.yana.shapesCalculating.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Square implements Shape{
    private double sideA;
    @Override
    public double calculateArea() {
        return Math.pow(sideA, 2);
    }

    @Override
    public double calculatePerimeter() {
        return sideA * 4;
    }
}
