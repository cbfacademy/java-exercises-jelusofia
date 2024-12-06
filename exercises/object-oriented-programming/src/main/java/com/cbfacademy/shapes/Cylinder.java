package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    double shapeRadius;
    double area;
    double shapeHeight;

    public Cylinder(String name, double radius, double height){
        super(name);
        this.shapeRadius = radius;
        this.shapeHeight = height;
    }

    @Override
    public double area(){
        area = shapeHeight * Math.PI * Math.pow(shapeRadius,2) ;
        return area;

    }
    
}
