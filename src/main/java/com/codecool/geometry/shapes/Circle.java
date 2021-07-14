package com.codecool.geometry.shapes;
import java.lang.Math;

public class Circle extends Shape {
    protected float r;


    public Circle(float r) {
        checkIfArgsGreaterThanZero(r);
        this.r = r;
    }

    @Override
    public double calculateArea() {

        return Math.pow(this.r,2)* Math.PI;
    }

    @Override

    public double calculatePerimeter() {

        return 2* this.r* Math.PI;

    }
    public static String getAreaFormula() {
        String formula = "π×r^2";
        return formula;
    }

    public static String getPerimeterFormula() {
        String formula = "2×π×r";
        return formula;
    }

    public Float getR() {
        return this.r;
    }

}
