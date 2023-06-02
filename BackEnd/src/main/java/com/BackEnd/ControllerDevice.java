package com.BackEnd;

import java.util.ArrayList;

import com.ClassProxy.DeviceProxy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.ConcreteClassDTO.*;

@RestController
public class ControllerDevice {
  
  @PostMapping("/getSensor")
  public ArrayList<Sensor> getSensors() {
    DeviceProxy dp = DeviceProxy.get();
    return dp.getSensors();
	}

  @PostMapping("/getScreen")
  public ArrayList<Screen> getScreens() {
    DeviceProxy dp = DeviceProxy.get();
    return dp.getScreens();
	}

  @PostMapping("/getProcessors")
  public ArrayList<Processor> getProcessors() {
    DeviceProxy dp = DeviceProxy.get();
    return dp.getProcessors();
	}
  
  @PostMapping("/getModels")
  public ArrayList<Model> getModels() {
    DeviceProxy dp = DeviceProxy.get();
    return dp.getModels();
	}

}
