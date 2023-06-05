package com.ConcreteClass;

public class Model {

    private int id;
    private String name;
    private Family family;

    public Model( int id , String name , Family family ){
        this.id = id;
        this.name = name;
        this.family = family;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Family getFamily() {
        return family;
    }

}
