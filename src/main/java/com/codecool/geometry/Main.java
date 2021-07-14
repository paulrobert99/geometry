package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    ShapeCollection shapes = new ShapeCollection();

        boolean isRunning = true;
        Scanner s = new Scanner(System.in);

        while (isRunning) {
            int option = 0; // TODO: get option from user
            System.out.println("1) Add shape\n2) Show shape list\n3) Show shape with the largest perimeter\n4) Show shape with the largest area\n5) Show formulas");
            System.out.print("Select option: ");
            int userOption = s.nextInt();
            option = userOption;
            switch (option) {
                case 1:
                    // clearScreen();
                    shapes = addShape(shapes);
                    break;
                case 2:
                    System.out.println(shapes.getShapes());
                    // clearScreen();
                    break;
                case 3:
                    // Show shape with the largest perimeter
                    break;
                case 4:
                    // Show shape with the largest area
                    break;
                case 5:
                    // Show formulas
                    break;
                case 0:
                    isRunning = false;
                    break;
            }
        }
    }

    private static ShapeCollection addShape(ShapeCollection shapes) {
        boolean isAddingShape = true;
        int option = 0;

        Scanner s = new Scanner(System.in);


        while(isAddingShape) {
            System.out.println("1) Circle\n2) Equilateral Triangle\n3) Rectangle\n4) Square\n5) Triangle\n6) Regular Pentagon");
            System.out.println("Select shape:");
            int userOption = s.nextInt();
            option = userOption;

            switch(option) {
                case 1:
                    System.out.print("Radius: ");
                    int radius = s.nextInt();
                    shapes.addShape(new Circle(radius));
                    System.out.println("Done!");
                    break;
                case 2:
                    System.out.print("Side's length of a triangle: ");
                    int eTA = s.nextInt();
                    shapes.addShape(new EquilateralTriangle(eTA));
                    System.out.println("Done!");
                    break;
                case 3:
                    System.out.print("One side length: ");
                    int rA = s.nextInt();
                    System.out.print("Second side length: ");
                    int rB = s.nextInt();
                    shapes.addShape(new Rectangle(rA, rB));
                    System.out.println("Done!");
                    break;
                case 4:
                    System.out.print("Side length: ");
                    int sA = s.nextInt();
                    shapes.addShape(new Rectangle(sA));
                    System.out.println("Done!");
                    break;
                case 5:
                    System.out.print("A side length: ");
                    int tA = s.nextInt();
                    System.out.print("B side length: ");
                    int tB = s.nextInt();
                    System.out.print("C side length: ");
                    int tC = s.nextInt();
                    shapes.addShape(new Triangle(tA, tB, tC));
                    System.out.println("Done!");
                    break;
                case 6:
                    System.out.print("A side length: ");
                    int pA = s.nextInt();
                    shapes.addShape(new RegularPentagon(pA));
                    System.out.println("Done!");
                    break;
                case 0:
                    // clearScreen();
                    isAddingShape = false;
                    break;
            }
            // clearScreen();
        }
        return shapes;
    }
    }
