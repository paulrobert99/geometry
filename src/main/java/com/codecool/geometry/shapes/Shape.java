package com.codecool.geometry.shapes;


/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {
    /**
     * Calculates shape's area.
     *
     * @return area of the shape
     */
    public abstract double calculateArea();

    /**
     * Calculates shape's perimeter.
     *
     * @return perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Check if all args are greater than 0
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     *
     * @param args
     * @return true if all of args are greater than 0
     */
    public static boolean checkIfArgsGreaterThanZero(float... args)throws IllegalArgumentException {
        for (Float arg:args){
            if (arg<1){
                throw new IllegalArgumentException("Arguments must be greater than zero");
            }
        }
        return false;
    }
}
