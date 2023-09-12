
# Shapes Caclulating

Calculate area and perimeter for Triangle, Rectangle, Cicle, Square


## API Reference

#### Calculate area and perimeter

```http
  POST http://localhost:8080/calculate/shapes
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `shapeName` | `string` | **Required**.|
| `sideA` | `double` | **NotRequired**.(base for triangle, base for squere, side for rectangle)  |
| `sideB` | `double` | **NotRequired**.(side for rectangle, side for tridngle)  |
| `sideC` | `double` | **NotRequired**.(side for rectangle, side for triangle)  |
| `radius` | `double` | **NotRequired**.(bace for circle)  |
| `height` | `double` | **NotRequired**. (height for triangle)  |





## Building the project

You will need:
Java JDK 8

Clone the project and run
```bash
  ./mvnw spring-boot:run

```