package com.Class;

import com.ClassAbstract.Product;
import com.ConcreteClass.Model;
import com.ConcreteClass.Processor;
import com.ConcreteClass.Screen;
import com.ConcreteClass.Sensor;

public class SmartTV extends Product{
  
  private float weight;

  public SmartTV(int id, Screen screen, Model model, Processor processor, Sensor[] sensors, float[] dimensions,
      int stored, float weight) {
    super(id, screen, model, processor, sensors, dimensions, stored);
    this.weight = weight;
  }

  public float getWeight(){
    return this.weight;
  }

}
