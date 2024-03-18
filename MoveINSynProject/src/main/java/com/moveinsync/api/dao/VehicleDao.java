package com.moveinsync.api.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.moveinsync.api.models.Vehicle;

@Component
public class VehicleDao {

	  static List<Vehicle> vehicles=new ArrayList<>();
	  public Vehicle getVehicleByVehicleNumber(String vehicleNumber)
	  {
		  List<Vehicle> filteredVehicles = vehicles.stream()
	                .filter(vehicle -> vehicle.getVehicleNumber().equals(vehicleNumber) && vehicle.isAvailable() == true)
	                .collect(Collectors.toList());
		  
		  return filteredVehicles.get(0);
	  }
	  
	  public  Vehicle getVehicleByQrCode(String qrCode)
	  {
		  List<Vehicle> filteredVehicles = vehicles.stream()
	                .filter(vehicle -> vehicle.getQrCode().equals(qrCode) && vehicle.isAvailable() == true)
	                .collect(Collectors.toList());
		  
		  return filteredVehicles.get(0); 
	  }
	  
	  
	  public void addVehicle(Vehicle vehicle)
	  {
		   vehicles.add(vehicle);
	  }
	  
	  
	  
}
