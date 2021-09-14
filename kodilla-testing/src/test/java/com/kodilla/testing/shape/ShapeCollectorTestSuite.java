package com.kodilla.testing.shape;

public class ShapeCollectorTestSuite {
    Circle circle = new Circle(23);
    Triangle triangle = new Triangle(12, 18);
    Square square = new Square(12);

    ShapeCollector testList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(
            circle, triangle, square)));
    ArrayList<Shape> testList=new ArrayList<Shape>(Arrays.asList(
            circle, triangle, square));
    ShapeCollector shapesCollection = new ShapeCollector(testList);

    //When
    //testList.showFigures();



    //Then
         Assert.assertEquals(testList.getShapeList(),testList.showFigures());
         Assert.assertEquals(testList,shapesCollection.showFigures());
}
     }
}
