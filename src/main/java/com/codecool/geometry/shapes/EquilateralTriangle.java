package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(float a){
        super (a,a,a);

    }
    public static String getAreaFormula() {
        return "(Math.sqrt(3) / 4) * Math.pow(this.a, 2)";
    }

    public static String getPerimeterFormula() {
        return "3 * a";
    }
    
}
