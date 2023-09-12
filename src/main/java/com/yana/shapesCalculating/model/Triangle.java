package com.yana.shapesCalculating.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Triangle implements Shape{
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;
    @Override
    public double calculateArea() {
        return sideA/2 * height;
    }

    @Override
    public double calculatePerimeter() {
        return getSideA() + getSideB() + getSideC();
    }
}
