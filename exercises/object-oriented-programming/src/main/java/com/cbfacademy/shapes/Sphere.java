package com.cbfacademy.shapes;
//import java.lang.Math.*;

public class Sphere extends Shape {
    double radius;
    double area;

    public Sphere(String name, double radius){
        super(name);
        this.radius = radius;

    }

    @Override
    public double area(){
        this.area = 4 * Math.PI * Math.pow(this.radius,2) ;
        return this.area;

    }

    
}
