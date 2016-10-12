package com.example.kfouryf.mycar;

/**
 * Created by kfouryf on 11/10/2016.
 */
class Car extends Vehicle /** One subclasse of vehicle  with an additional field called color **/
{
    private String color;

    public Car(String make, int year,String Color)
    {
        super(make, year); /** Fait appel a make et year de la fonction parent **/
        this.color=color;
        setMessage(getMessage() + " I like your shining " + color + " color.");
    }
}

class Diesel extends Vehicle implements Vehicle.Controllable { /** Second subclass of vehicle **/
/**'implements' defines a relationship between a class (Diesel) and an interface (Vehicle.Controllable).**/

    private String type;

    public Diesel(String make, int year){
        super(make, year);
        this.type = "Diesel";
    }

    @Override
    public void control() {
        setMessage(super.getMessage() + " Emission is under control.");
    }

    @Override
    public String getMessage() {
        control();
        return super.getMessage();
    }
}