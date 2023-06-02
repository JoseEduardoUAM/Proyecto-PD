package com.ClassProxy;

import java.util.ArrayList;

import com.Interface.Product;

import com.ClassDTO.*;
import com.ConcreteClassDTO.*;
import com.ConcreteClassDTO.Screen;

public class ProductProxy {
  
  private static ProductProxy pp;
  private ArrayList<Product> smartphones;
  private ArrayList<Product> smartwatch;
  private ArrayList<Product> smartTV;
  private ArrayList<Product> tablets;

  private ProductProxy(){
    this.smartphones = new ArrayList<>();
    this.smartwatch = new ArrayList<>();
    this.smartTV = new ArrayList<>();
    this.tablets = new ArrayList<>();
  }

  public static synchronized ProductProxy get(){
    if( pp == null ) pp = new ProductProxy();
    return pp;
  }

  public ArrayList<Product> getProductsAll(){
    ArrayList<Product> products = new ArrayList<>();
    if( products.size() == 0 ){
      products.addAll( getSmartphones() );
      products.addAll( getSmartWatch() );
      products.addAll( getSmartTV() );
      products.addAll( getTablets() );
    }
    return products;
  }

  public ArrayList<Product> getSmartphones(){
    DeviceProxy dp = DeviceProxy.get();
    ArrayList<Sensor> sensors = dp.getSensors();
    ArrayList<Screen> screens = dp.getScreens();
    ArrayList<Processor> processors = dp.getProcessors();
    ArrayList<Model> models = dp.getModels();
    if( smartphones.size() == 0 ){
      smartphones.add(
        new Smartphone( 
          0 , screens.get(0) , models.get(1) , processors.get(0) , 
          new Sensor[]{sensors.get(0)} , new int[]{ 1 , 23 ,5 } , 500 , 
          new String[]{ "red" , "blue" } , 5 )
      );
    }
    return smartphones;
  }

  public ArrayList<Product> getSmartWatch(){
    DeviceProxy dp = DeviceProxy.get();
    ArrayList<Sensor> sensors = dp.getSensors();
    ArrayList<Screen> screens = dp.getScreens();
    ArrayList<Processor> processors = dp.getProcessors();
    ArrayList<Model> models = dp.getModels();
    if( smartwatch.size() == 0 ){
      smartwatch.add(
        new Smartwatch( 2 , screens.get(2) , models.get(2) , processors.get(1) ,
        new Sensor[]{ sensors.get(1) , sensors.get(2) , sensors.get(3) } , new int[]{ 5 , 1 , 4 } , 1000 )
      );
    }
    return smartwatch;
  }

  public ArrayList<Product> getTablets(){
    DeviceProxy dp = DeviceProxy.get();
    ArrayList<Sensor> sensors = dp.getSensors();
    ArrayList<Screen> screens = dp.getScreens();
    ArrayList<Processor> processors = dp.getProcessors();
    ArrayList<Model> models = dp.getModels();
    if( tablets.size() == 0 ){
      tablets.add(
        new Tablet(0,screens.get(2),models.get(4),
        processors.get(3),new Sensor[]{ sensors.get(0) , sensors.get(1) , sensors.get(2) } , 
        new int[]{ 3 , 6 ,7 } , 650 , new String[]{ "red" , "black" , "green" })
      );
    }
    return tablets;
  }

  public ArrayList<Product> getSmartTV(){
    DeviceProxy dp = DeviceProxy.get();
    ArrayList<Sensor> sensors = dp.getSensors();
    ArrayList<Screen> screens = dp.getScreens();
    ArrayList<Processor> processors = dp.getProcessors();
    ArrayList<Model> models = dp.getModels();
    if( smartTV.size() == 0 ){
      smartTV.add(
        new SmartTV( 0 , screens.get(2) , models.get(4) ,
        processors.get(3) , new Sensor[]{ sensors.get(0) , sensors.get(1) , sensors.get(2) } , 
        new int[]{ 3 , 6 ,7 } , 650 , (float) 25.3 )
      );
    }
    return smartTV;
  }

}
