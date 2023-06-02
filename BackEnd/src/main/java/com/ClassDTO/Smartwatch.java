package com.ClassDTO;

import com.ConcreteClassDTO.Model;
import com.ConcreteClassDTO.Processor;
import com.ConcreteClassDTO.Screen;
import com.ConcreteClassDTO.Sensor;
import com.Interface.Product;

public record Smartwatch(
  int id , Screen screen , Model model , Processor processor , Sensor[] sensors , int[] dimension , int stored
) implements Product{}
