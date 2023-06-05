package com.ConcreteClass;

public class Processor {

    private int id;
    private String name;
    private String speed;

    public Processor( int id , String name , String speed ){
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpeed() {
        return speed;
    }

}
