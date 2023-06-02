package com.ClassProxy;

import com.ClassDTO.*;
import com.ConcreteClassDTO.*;
import com.Interface.Product;

import java.util.ArrayList;

public class InventoryProxy {
  
  private static InventoryProxy ip;
  private ArrayList<Inventory> inventories;

  public InventoryProxy(){
    this.inventories = new ArrayList<>();
  }

  public static synchronized InventoryProxy get(){
    if( ip == null ) ip = new InventoryProxy();
    return ip;
  }

  public ArrayList<Inventory> getInventories(){
    ProductProxy pp = ProductProxy.get();
    FactoryErrorProxy fep = FactoryErrorProxy.get();
    ArrayList<Product> products = pp.getProductsAll();
    ArrayList<FactoryError> fe = fep.getFactoryErrors();
    if( inventories.size() == 0 ){
      inventories.add( 
        new Inventory(1, products.get(0), new FactoryError[]{ fe.get(0) , fe.get(1) }, "Sell")
      );
      inventories.add( 
        new Inventory(2, products.get(1), null, "Stored")
      );
      inventories.add( 
        new Inventory(3, products.get(0), null, "Devolution")
      );
      inventories.add( 
        new Inventory(4, products.get(2), null, "Stored")
      );
      inventories.add( 
        new Inventory(5, products.get(3), null, "Stored")
      );
      inventories.add( 
        new Inventory(5, products.get(3), null, "Stored")
      );
    }

    return inventories;
  }

}
