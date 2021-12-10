package com.example.graphics;

import javafx.stage.Stage;

public abstract class Rectangle extends Shape {
    double width, height;
    Shape rectangle = new Shape();

    @Override
    public double computeArea(double width, double height) {
        double area = height * width;
        return area;
    }

    @Override
    public double computeCircumference(double width, double height) {
        double circumference = (double) 2 * (height + width);
        return circumference;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public void Rectangule(double x, double y) {
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

    public void Rectangle(double x, double y) {
        super(x, y);
    }

    public abstract void start(Stage primaryStage);
}
