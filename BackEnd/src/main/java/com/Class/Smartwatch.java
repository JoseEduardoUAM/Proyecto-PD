package com.Class;

import com.ClassAbstract.Product;
import com.ConcreteClass.Model;
import com.ConcreteClass.Processor;
import com.ConcreteClass.Screen;
import com.ConcreteClass.Sensor;

public class Smartwatch extends Product{

  public Smartwatch(int id, Screen screen, Model model, Processor processor, Sensor[] sensors, float[] dimensions, int stored) {
    super(id, screen, model, processor, sensors, dimensions, stored);
  }

}
