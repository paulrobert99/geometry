package com.codecool.geometry.shapes;

public class Rectangle extends Shape {
protected float a;
protected float b;

public Rectangle(float a, float b){
    checkIfArgsGreaterThanZero(a,b);
    this.a = a;
    this.b = b;


}
public Rectangle(float a){
    checkIfArgsGreaterThanZero(a);
    this.a = a;
}
    @Override
    public double calculateArea() {
        Double area = this.a * this.b * 1.0;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        Double perimeter = 2.0 * this.a + 2.0 * this.b;
        return perimeter;
    }
    public static String getAreaFormula() {
        return "a*b";
    }

    public static String getPerimeterFormula() {
        return "a+b";
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }
}
