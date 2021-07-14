package com.codecool.geometry.shapes;

public class Triangle extends Shape {
protected float a;
protected float b;
protected float c;

public Triangle(float a, float b, float c){
    checkIfArgsGreaterThanZero(a,b,c);
    this.a = a;
    this.b = b;
    this.c = c;

}
    @Override
    public double calculateArea() {
        Double perimeter = (this.a + this.b + this.c) / 2.0;
        Double area = Math.sqrt(perimeter * (perimeter- this.a) * (perimeter- this.b) * (perimeter- this.c));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        Double perimeter = (double)this.a + (double) this.b + (double) this.c;
        return perimeter;
    }
    public static String getAreaFormula() {
        return "sqrt(s(s-a)(s-b)(s-c)),\nwhere s = (a+b+c)/2";
    }

    public static String getPerimeterFormula() {
        return "a + b + c";
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }

    public float getC() {
        return this.c;
    }
}
