package com.moveinsync.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moveinsync.api.dao.BookingDao;
import com.moveinsync.api.dao.VehicleDao;
import com.moveinsync.api.models.Vehicle;

@Component
public class BookingService {

	  @Autowired
	  VehicleDao vehicleDao; 
	  @Autowired
	  BookingDao bookingDao;
	  
//	  public VehicleBookingService(VehicleDao vehicleDao, BookingDao bookingDao) {
//		
//		this.vehicleDao = vehicleDao;
//		this.bookingDao = bookingDao;
//	}
	 
	 public boolean makeAdvancedBooking(String userId,String vehicleNumber)
	 {
		  
		  Vehicle vehicle=vehicleDao.getVehicleByVehicleNumber(vehicleNumber);
		  vehicle.setAvailable(true);
		  bookingDao.addBooking(userId, vehicle);  
		  return true;
	 }
	 public boolean bookUsingQrCode(String userId, String qrCode)
	 {
		 
		  Vehicle vehicle=vehicleDao.getVehicleByQrCode(qrCode);
		  vehicle.setAvailable(true);
		  bookingDao.addBooking(userId, vehicle);
		  return true;
	 }
	 
	 public List<Vehicle> getBookingsByUserId(String userId)
	 {
		 return bookingDao.getBookingsByUserId(userId);
	 }
	
	
}
