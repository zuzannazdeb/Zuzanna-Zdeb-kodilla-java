package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {
    @Nested
    @DisplayName("Changing list")
    class ChangingList {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            //When
            collector.addFigure(new Circle());
            //Then
            Assertions.assertEquals(1, collector.getShapes().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            Circle circle = new Circle();
            ShapeCollector collector = new ShapeCollector();
            collector.getShapes().add(circle);
            //When
            collector.removeFigure(circle);
            //Then
            Assertions.assertEquals(0, collector.getShapes().size());
        }

    }

    @Nested
    @DisplayName("Not changing list")
    class NotChangingList{

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        collector.getShapes().add(new Circle());
        //When
        Shape result = collector.getFigure(0);
        //Then
        Assertions.assertEquals(result.getClass(), Circle.class);
    }

    @Test
    void testShowFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        collector.getShapes().add(new Circle());
        collector.getShapes().add(new Triangle());
        //When
        String result = collector.showFigures();
        //Then
        Assertions.assertEquals("Circle, Triangle", result);
    }
}
}
