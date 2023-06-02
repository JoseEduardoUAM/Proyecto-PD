package com.ClassProxy;

import java.util.ArrayList;

import com.ConcreteClassDTO.FactoryError;

public class FactoryErrorProxy {

  private static FactoryErrorProxy fep;
  private ArrayList<FactoryError> factoryErrors;

  public FactoryErrorProxy(){
    factoryErrors = new ArrayList<>();
  }

  public static synchronized FactoryErrorProxy get(){
    if( fep == null ) fep = new FactoryErrorProxy();
    return fep;
  }

  public ArrayList<FactoryError> getFactoryErrors(){
    if( factoryErrors.size() == 0 ){
      factoryErrors.add( new FactoryError( 1, "Error en las pantalla" ) );
      factoryErrors.add( new FactoryError( 2, "Error en la Bateria" ) );
      factoryErrors.add( new FactoryError( 3, "Fallo en conexion de internet" ) );
      factoryErrors.add( new FactoryError( 4, "Error en touch" ) );
      factoryErrors.add( new FactoryError( 5, "Cargador no compatible" ) );
    }
    return factoryErrors;
  }

}
