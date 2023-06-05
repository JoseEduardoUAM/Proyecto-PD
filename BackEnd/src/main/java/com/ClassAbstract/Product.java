package com.ClassAbstract;

import com.ConcreteClass.*;

public abstract class Product {
    
    private final int id;
    private final Screen screen;
    private Model model;
    private final Processor processor;
    private final Sensor[] sensors;
    private final float[] dimensions;
    private final int stored;

    public Product( int id , Screen screen , Model model , Processor processor , Sensor[] sensors , float[] dimensions , int stored ){
        this.id = id;
        this.screen = screen;
        this.model = model;
        this.processor = processor;
        this.sensors = sensors;
        this.dimensions = dimensions;
        this.stored = stored;
    }

    public int getId() {
        return id;
    }

    public Screen getScreen() {
        return screen;
    }

    public Model getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Sensor[] getSensors() {
        return sensors;
    }

    public float[] getDimensions() {
        return dimensions;
    }

    public int getStored() {
        return stored;
    }

}
