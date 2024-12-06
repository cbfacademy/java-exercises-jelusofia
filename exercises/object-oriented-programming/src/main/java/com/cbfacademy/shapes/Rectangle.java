package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    double shapeLenght;
    double shapeWidth;
    double area;

    public Rectangle(String name, double lenght, double width){
        super(name);
        this.shapeLenght = lenght;
        this.shapeWidth = width;
    }

    @Override
    public double area(){
        area = shapeLenght * shapeWidth ;
        return area;
    }
    
}
