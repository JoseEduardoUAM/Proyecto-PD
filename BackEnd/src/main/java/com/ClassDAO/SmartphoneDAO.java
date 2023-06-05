package com.ClassDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Class.Smartphone;
import com.ClassAbstract.Product;
import com.DataBase.Connect;

public class SmartphoneDAO {
  
  public static ArrayList<Product> getProductAll(){
    Connect conn;
    ArrayList<Product> products = new ArrayList<>();
    try {
      conn = Connect.get();
    } catch (Exception e) {
      return products;
    }
    try {
      ResultSet result = conn.initConnection().createStatement().executeQuery("SELECT * FROM Smartphone");
      return products;
    } catch (Exception e) {
      return products;
    }
  }

}
