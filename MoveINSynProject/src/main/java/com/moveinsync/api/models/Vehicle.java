package com.moveinsync.api.models;


public class Vehicle {

	public enum VehicleType {

		CAR, MOTORCYCLE, BICYCLE

	}
	
	private boolean isAvailable;
	private String vehicleNumber;
	private String qrCode;
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

}
