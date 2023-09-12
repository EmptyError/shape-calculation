package com.yana.shapesCalculating.model;

import com.yana.shapesCalculating.exeptions.ShapeNotSupportedException;
import com.yana.shapesCalculating.request.ShapeRequest;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
    public Shape createShape(ShapeRequest request) {
        switch (request.getShapeName().toLowerCase()) {
            case "triangle":
                return createTriangle(request);
            case "circle":
                return createCircle(request);
            case "rectangle":
                return createRectangle(request);
            case "square":
                return createSquare(request);
            default: throw new ShapeNotSupportedException("This shape is not supported");

        }
    }

    private Square createSquare(ShapeRequest request) {
        return new Square(request.getSideA());
    }

    private Circle createCircle(ShapeRequest request) {
        return new Circle(request.getRadius());
    }

    private Rectangle createRectangle(ShapeRequest request) {
        return new Rectangle(request.getSideA(), request.getSideB());
    }

    private Triangle createTriangle(ShapeRequest request) {
        return  new Triangle(request.getSideA(), request.getSideB(), request.getSideC(), request.getHeight());
    }
}
