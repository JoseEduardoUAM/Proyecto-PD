package com.BackEnd;

import java.util.ArrayList;

import com.ClassProxy.DeviceProxy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ConcreteClassDTO.*;

@RestController
public class ControllerDevice {
  
  @CrossOrigin(origins = "*")
  @PostMapping("/getSensor")
  public ArrayList<Sensor> getSensors() {
    DeviceProxy dp = DeviceProxy.get();
    return dp.getSensors();
	}

  @CrossOrigin(origins = "*")
  @PostMapping("/getScreen")
  public ArrayList<Screen> getScreens() {
    DeviceProxy dp = DeviceProxy.get();
    return dp.getScreens();
	}

  @CrossOrigin(origins = "*")
  @PostMapping("/getProcessors")
  public ArrayList<Processor> getProcessors() {
    DeviceProxy dp = DeviceProxy.get();
    return dp.getProcessors();
	}
  
  @CrossOrigin(origins = "*")
  @PostMapping("/getModels")
  public ArrayList<Model> getModels() {
    DeviceProxy dp = DeviceProxy.get();
    return dp.getModels();
	}

}
