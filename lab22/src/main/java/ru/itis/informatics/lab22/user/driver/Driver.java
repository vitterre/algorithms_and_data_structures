package ru.itis.informatics.lab22.user.driver;

import ru.itis.informatics.lab22.user.Client;
import ru.itis.informatics.lab22.vehicle.Vehicle;

public final class Driver extends Client {
	private Vehicle vehicle;

	public Driver(String phoneNumber, String name, Vehicle vehicle) {
		super(phoneNumber, name);
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
