package com.yana.shapesCalculating.controller;


import com.yana.shapesCalculating.model.Shape;
import com.yana.shapesCalculating.model.ShapeFactory;
import com.yana.shapesCalculating.request.ShapeRequest;
import com.yana.shapesCalculating.response.ShapeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/calculate")
public class ShapeController
{
    private final ShapeFactory shapeFactory;

    @PostMapping("/shapes")
    public ResponseEntity<ShapeResponse> calculateShape(@Valid @RequestBody ShapeRequest request) {
        Shape shape = shapeFactory.createShape(request);
        double area = shape.calculateArea();
        double perimeter = shape.calculatePerimeter();
        ShapeResponse response = new ShapeResponse(area, perimeter);
        return ResponseEntity.ok(response);
    }
}
