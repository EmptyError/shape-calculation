package com.yana.shapesCalculating.exeptions;

public class ShapeNotSupportedException extends RuntimeException{
    public ShapeNotSupportedException(String message) {
        super("This shape is not supported");
    }
}
