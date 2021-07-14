package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {

protected List<Shape>shapes;



public ShapeCollection(){
    this.shapes = new ArrayList<Shape>();
}


public void addShape(Shape shape){
    this.shapes.add(shape);


}
public Shape getShape(int index){
    return this.shapes.get(index);


}

public String getShapes(){
    StringBuilder table = new StringBuilder();
    for(int i=0;i<this.shapes.size();i++) {

        Shape shape = this.shapes.get(i);
        String className = shape.getClass().getName();
        String areaFormula = invokeStaticMethod("getAreaFormula", className);
        String perimeterFormula = invokeStaticMethod("getPerimeterFormula", className);

        table.append(i)
                .append(" | ")
                .append(shape.getClass().getSimpleName())
                .append(" | ")
                .append(shape.calculatePerimeter())
                .append(" | ")
                .append(perimeterFormula)
                .append(" | ")
                .append(shape.calculateArea())
                .append(areaFormula)
                .append(" | \n");
    }
    return table.toString();
}
    public static String invokeStaticMethod(String methodName, String className) {
        try {
            Class c = Class.forName(className);
            Method m = c.getDeclaredMethod(methodName);
            Object o = m.invoke(null);
            return o + "";
        } catch (Exception e) {
            return "null";
        }
    }
}
