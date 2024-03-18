package com.moveinsync.api.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.moveinsync.api.models.Vehicle;

@Component
public class BookingDao {
	
	 Map<String,List<Vehicle>> userBookings=new HashMap<>();  // key:-userId 
	 
	 public void addBooking(String userId,Vehicle vehicle)
	 {
		  
		   if(userBookings.containsKey(userId))
		   {
			   userBookings.get(userId).add(vehicle);
			   
		   }
		   else
		   {
			   List<Vehicle> vehicles=new ArrayList<Vehicle>();
			   vehicles.add(vehicle);
			   userBookings.put(userId,vehicles);  
		   }
	 }
	 
	 public List<Vehicle> getBookingsByUserId(String userId)
	 {
		 return userBookings.get(userId);
	 }

}
