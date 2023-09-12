package com.yana.shapesCalculating.request;

import lombok.Data;

import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;


@Data
@NoArgsConstructor
public class ShapeRequest {
    @NotEmpty(message = "Shape name is required")
    private String shapeName;
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;
    private double radius;
}
