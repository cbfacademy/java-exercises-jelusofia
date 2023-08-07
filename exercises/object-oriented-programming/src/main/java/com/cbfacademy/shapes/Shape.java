package com.cbfacademy.shapes;

public abstract class Shape {
    protected String shapeName;

    public Shape ( String name){
        this.shapeName = name;

    }

    public abstract double area();

    public String toString(String name){
        this.shapeName = name;
        return shapeName;
    }
    
}
