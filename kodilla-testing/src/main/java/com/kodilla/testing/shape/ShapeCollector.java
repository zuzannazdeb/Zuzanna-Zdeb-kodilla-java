package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }
    public Shape getFigure(int n){
        return shapes.get(n);
    }
    public String showFigures(){
        String shapeNames = "";
        int n = 0;
        for (Shape shape:shapes) {
            if(n != shapes.size() - 1){
                shapeNames = shapeNames + shape.getShapeName() + ", ";
            }else{
                shapeNames = shapeNames + shape.getShapeName();
            }
            n++;
        }
        return shapeNames;
    }

}
