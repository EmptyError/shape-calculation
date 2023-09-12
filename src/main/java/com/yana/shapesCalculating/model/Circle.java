package com.yana.shapesCalculating.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle implements Shape {
    private double radius;

    @Override
    public double calculateArea() {
        return Math.pow(radius, 2)* Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
