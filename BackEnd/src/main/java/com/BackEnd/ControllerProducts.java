package com.BackEnd;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ClassProxy.ProductProxy;
import com.ConcreteClassDTO.Sensor;
import com.Interface.Product;
import com.ClassDTO.Smartphone;

import java.util.ArrayList;

@RestController
public class ControllerProducts {
  
  @PostMapping("/getProductsAll")
  public ArrayList<Product> getProductsAll() {
    ProductProxy pp = ProductProxy.get();
    return pp.getProductsAll();
	}

  @PostMapping("/getSmarphones")
  public ArrayList<Product> getSmartphones() {
    ProductProxy pp = ProductProxy.get();
    return pp.getSmartphones();
	}

  @PostMapping("/getSmartwatch")
  public ArrayList<Product> getSmartwatch() {
    ProductProxy pp = ProductProxy.get();
    return pp.getSmartWatch();
	}

  @PostMapping("/getTablets")
  public ArrayList<Product> getTablets() {
    ProductProxy pp = ProductProxy.get();
    return pp.getTablets();
	}

  @PostMapping("/getSmartTV")
  public ArrayList<Product> getSmartTV() {
    ProductProxy pp = ProductProxy.get();
    return pp.getSmartTV();
	}

  @PostMapping("/addProducts")
  public ResponseMessage addProduct( 
    @RequestBody Smartphone product
  ) {
    Sensor[] sensors = product.sensors();
    System.out.println( sensors[0] );
    return new ResponseMessage( 200 , "Se agregaron los productos" );
	}

}

record ResponseMessage( int status , String message ){}
