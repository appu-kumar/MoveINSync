package com.moveinsync.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moveinsync.api.dao.VehicleDao;
import com.moveinsync.api.models.Vehicle;

@Component
public class VehicleService {

	  @Autowired
	   VehicleDao vehicleDao;
	
	  public void addVehicle(Vehicle vehicle)
	  {
		   vehicleDao.addVehicle(vehicle);
	  }
}
