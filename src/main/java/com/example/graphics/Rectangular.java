package com.example.graphics;

public class Rectangular extends Shape {

    Shape rectangle = new Shape() {
        @Override
        public double computeArea() {
            double area= height*width;
            return area;
        }
        @Override
        public double computeCircumference() {
            double circumference= (double) 2*(height+width);
            return circumference;
        }
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public Rectangular(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangular(double x, double y) {
        super(x, y);
    }
    double width, height;
}
