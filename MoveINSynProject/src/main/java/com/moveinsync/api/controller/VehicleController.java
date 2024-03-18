package com.moveinsync.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moveinsync.api.models.Vehicle;
import com.moveinsync.api.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService vehicleService;

	@PostMapping("/addVehicle")
	public ResponseEntity<String> addVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.addVehicle(vehicle);

		return ResponseEntity.status(HttpStatus.OK).body("Vehicle added successfully");
	}
}
