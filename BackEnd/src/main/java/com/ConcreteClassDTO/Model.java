package com.ConcreteClassDTO;

public record Model( int id , String name , Family family ) {

  public Model( int id , String name ){
    this( id , name , null );
  }

}
