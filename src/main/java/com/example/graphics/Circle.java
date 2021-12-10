package com.example.graphics;

import java.lang.Math;

public class Circle extends Shape {
    int x,y;
    double radius;
    Shape circle = new Shape();
        @Override
        public double computeArea(double radius) {
            double area= Math.PI*Math.pow(radius,2);
            return area;
        }
        @Override
        public double computeCircumference(double radius) {
            double circumference= (double) 2*Math.PI*radius;
            return circumference;
        }

    @Override
    public String toString() {
        return "Circle{" +
                "circle=" + circle +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    public Circle(double x, double y, double radius) {
        this.x=x;
        this.y=y;
        this.radius = radius;
    }



}
