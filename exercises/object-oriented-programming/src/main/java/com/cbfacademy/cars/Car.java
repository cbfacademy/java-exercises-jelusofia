package com.cbfacademy.cars;

public class Car {
    String make;
    String model;
    int year;


    // constructor method
    public Car(String carMake, String carModel, int carYear) {
        this.make= carMake;
        this.model= carModel;
        this.year = carYear;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }


    public static void main(String[] args){
        Car car1 = new Car("Volvo", "V40", 2012);
        Car car2 = new Car("Porsche", "Panana", 2009);
        Car car3 = new Car("Audi", "A3", 2018);

        System.out.println(car2.getMake());
    }
    
  
}