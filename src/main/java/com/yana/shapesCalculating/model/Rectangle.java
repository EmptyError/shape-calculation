package com.yana.shapesCalculating.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Shape {
    private double sideA;
    private double sideB;
    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return sideA * 2 + sideB * 2;
    }
}
