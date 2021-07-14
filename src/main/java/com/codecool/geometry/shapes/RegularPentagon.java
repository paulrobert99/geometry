package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {
protected float a;

public RegularPentagon(float a){
    checkIfArgsGreaterThanZero(a);
    this.a = a;
}
    @Override
    public double calculateArea() {
        Double area = (Math.pow(a,2)*Math.sqrt(5*(5+2*Math.sqrt(5))))/ 4;
        return area;
    }

    @Override
    public double calculatePerimeter() {
    Double perimeter = 5.0 * this.a;
        return perimeter;
    }
    public float getA() {
        return this.a;
    }

    public static String getAreaFormula() {
        return "(a2 sqrt(5(5+2sqrt(5))))/4";
    }

    public static String getPerimeterFormula() {
        return "5a";
    }
}
