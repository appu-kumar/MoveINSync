package com.moveinsync.api.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moveinsync.api.models.Vehicle;
import com.moveinsync.api.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;

	@PostMapping("/bookUsingVehicleNumber/{userId}/{vehicleNumber}")
	public ResponseEntity<String> makeAdvancedBooking(@PathVariable String userId, @PathVariable String vehicleNumber) {
		if (bookingService.makeAdvancedBooking(userId, vehicleNumber))
			return ResponseEntity.status(HttpStatus.OK).body("Booked Successfully by using vehicleNumber");
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Not Booked by using vehicleNumber");

	}

	@PostMapping("/bookUsingQrCode/{userId}/{qrCode}")
	public ResponseEntity<String> bookUsingQrCode(@PathVariable String userId, @PathVariable String qrCode) {
			
		if (bookingService.bookUsingQrCode(userId, qrCode))
			return ResponseEntity.status(HttpStatus.OK).body("Booked Successfully by using qrCode");
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Not Booked by using qrCode");
	}
	
	@GetMapping("/getBookingsByUserId/{userId}")
	public ResponseEntity<Object> getBookingsByUserId(@PathVariable String userId) {
			
		   List<Vehicle> vehicles=bookingService.getBookingsByUserId(userId);
		
			return ResponseEntity.status(HttpStatus.OK).body(vehicles);
		
	}
	
	

}
