package com.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
  
  private static Connect connect;
  private Connection connection;
  private String USER;
  private String PASSWORD;

  private Connect() {
    this.USER = "";
    this.PASSWORD = "";
  }

  public static synchronized Connect get(){
    if( connect == null ) connect = new Connect();
    return connect;
  }
  
  public Connection initConnection(){
    try {
      Class.forName("org.mariadb.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException("Error en el driver de conexion a la base de datos");
    }
    try {
      this.connection = DriverManager.getConnection( "", USER, PASSWORD);
    } catch (SQLException e) {
      throw new RuntimeException("Error en la conexion con la base de datos");
    }
    return this.connection;
  }

  public void closeConnection(){
    try {
        if( this.connection != null ) this.connection.close();
      } catch (SQLException e) {
        throw new RuntimeException("Error al cerrar la base de datos");
      }
  }

}
