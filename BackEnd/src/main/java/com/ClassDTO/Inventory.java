package com.ClassDTO;

import com.ConcreteClassDTO.FactoryError;
import com.Interface.Product;


public record Inventory(
  int id , Product product , FactoryError[] factoryError , String state
) {
  
}
