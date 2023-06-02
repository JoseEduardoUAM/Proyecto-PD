package com.ClassProxy;

import java.util.ArrayList;

import com.ConcreteClassDTO.*;

public class DeviceProxy {
  
  private static DeviceProxy dp;
  private ArrayList<Sensor> sensors;
  private ArrayList<Screen> screens;
  private ArrayList<Processor> processors;
  private ArrayList<Model> models;

  private DeviceProxy(){ 
    sensors = new ArrayList<>();
    screens = new ArrayList<>();
    processors = new ArrayList<>();
    models = new ArrayList<>();
  }

  public static synchronized DeviceProxy get(){
    if( dp == null ) dp = new DeviceProxy();
    return dp;
  }

  public ArrayList<Sensor> getSensors(){
    if( sensors.size() == 0 ){
      sensors.add( new Sensor( 1, "Sensor de Movimiento" ) );
      sensors.add( new Sensor( 2, "Sensor de Proximidad" ) );
      sensors.add( new Sensor( 3, "Sensor de Distancia" ) );
      sensors.add( new Sensor( 4, "Sensor de Humedad" ) );
      sensors.add( new Sensor( 4, "Sensor de Frecuencia de Luz" ) );
      sensors.add( new Sensor( 4, "Sensor de posición" ) );
      sensors.add( new Sensor( 4, "Sensor de sonido" ) );
    }
    return sensors;
  }

  public ArrayList<Screen> getScreens(){
    if( screens.size() == 0 ){
      screens.add( new Screen( 1 , "AMOLED" ) );
      screens.add( new Screen( 2 , "LCD" ) );
      screens.add( new Screen( 3 , "OLED" ) );
    }
    return screens;
  }

  public ArrayList<Processor> getProcessors(){
    if( processors.size() == 0 ){
      processors.add( new Processor( 1 , "Dimensity" , "3350 MHZ" ) );
      processors.add( new Processor( 2 , "Snapdragon" , "3200 MHZ" ) );
      processors.add( new Processor( 3 , "A16 Bionec" , "3460 MHZ" ) );
      processors.add( new Processor( 4 , "Tensor G2" , "2850 MHZ" ) );
    }
    return processors;
  }

  public ArrayList<Model> getModels(){
    if( models.size() == 0 ){
      Family[] familys = new Family[]{
        new Family( 1 , "Galaxy Z" ) ,
        new Family( 2 , "Galaxy A" ) ,
        new Family( 3 , "Galaxy M" ) ,
        new Family( 4 , "Galaxy J" ) ,
      }; 
  
      models.add( new Model( 1 , "Fold4" , familys[0] ) );
      models.add( new Model( 2 , "Flip4" , familys[0] ) );
      models.add( new Model( 3 , "12" , familys[1] ) );
      models.add( new Model( 4 , "24" , familys[1] ) );
      models.add( new Model( 5 , "34 5G" , familys[1] ) );
      models.add( new Model( 6 , "14" , familys[1] ) );
      models.add( new Model( 7 , "54" , familys[2] ) );
      models.add( new Model( 8 , "33" , familys[2] ) );
      models.add( new Model( 9 , "14" , familys[2] ) );
    }
    return models;
  }

}
