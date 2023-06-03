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
  
  @CrossOrigin(origins = "*")
  @PostMapping("/getProductsAll")
  public ArrayList<Product> getProductsAll() {
    ProductProxy pp = ProductProxy.get();
    return pp.getProductsAll();
	}

  @CrossOrigin(origins = "*")
  @PostMapping("/getSmarphones")
  public ArrayList<Product> getSmartphones() {
    ProductProxy pp = ProductProxy.get();
    return pp.getSmartphones();
	}

  @CrossOrigin(origins = "*")
  @PostMapping("/getSmartwatch")
  public ArrayList<Product> getSmartwatch() {
    ProductProxy pp = ProductProxy.get();
    return pp.getSmartWatch();
	}

  @CrossOrigin(origins = "*")
  @PostMapping("/getTablets")
  public ArrayList<Product> getTablets() {
    ProductProxy pp = ProductProxy.get();
    return pp.getTablets();
	}

  @CrossOrigin(origins = "*")
  @PostMapping("/getSmartTV")
  public ArrayList<Product> getSmartTV() {
    ProductProxy pp = ProductProxy.get();
    return pp.getSmartTV();
	}

  @CrossOrigin(origins = "*")
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
