package com.Class;

import com.ClassAbstract.Product;
import com.ConcreteClass.Model;
import com.ConcreteClass.Processor;
import com.ConcreteClass.Screen;
import com.ConcreteClass.Sensor;

public class Smartphone extends Product{
  
  private String[] color;
  private int numberSIM;

  public Smartphone(int id, Screen screen, Model model, Processor processor, Sensor[] sensors, float[] dimensions, int stored, String[] color, int numberSIM) {
    super(id, screen, model, processor, sensors, dimensions, stored);
    this.color = color;
    this.numberSIM = numberSIM;
  }

  public String[] getColor() {
    return color;
  }

  public int getNumberSIM() {
    return numberSIM;
  }

}
