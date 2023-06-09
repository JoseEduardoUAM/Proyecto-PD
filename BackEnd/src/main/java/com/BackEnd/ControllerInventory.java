package com.BackEnd;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ClassDTO.Inventory;
import com.ClassProxy.InventoryProxy;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class ControllerInventory {
  
  @CrossOrigin(origins = "*")
  @PostMapping("/getInventoryAll")
  public ArrayList<Inventory> getInventoryAll() {
    InventoryProxy ip = InventoryProxy.get();
    return ip.getInventories();
	}

}