package com.codecool.geometry.shapes;

public class Square extends Rectangle {

    public Square(float a){
        super(a);
    }
    public static String getAreaFormula() {
        String area = "a^2";
        return area;
    }

    public static String getPerimeterFormula() {
        String parimiter = "4×a";
        return parimiter;
    }
    
}
