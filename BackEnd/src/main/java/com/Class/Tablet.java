package com.Class;

import com.ClassAbstract.Product;
import com.ConcreteClass.Model;
import com.ConcreteClass.Processor;
import com.ConcreteClass.Screen;
import com.ConcreteClass.Sensor;

public class Tablet extends Product{
  
  private String[] color;

  public Tablet(int id, Screen screen, Model model, Processor processor, Sensor[] sensors, float[] dimensions, int stored, String[] color) {
    super(id, screen, model, processor, sensors, dimensions, stored);
    this.color = color;
  }

  public String[] getColor() {
    return color;
  }

}
