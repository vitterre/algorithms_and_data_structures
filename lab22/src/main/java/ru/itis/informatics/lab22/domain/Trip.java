package ru.itis.informatics.lab22.domain;

import ru.itis.informatics.lab22.user.Client;
import ru.itis.informatics.lab22.details.Details;
import ru.itis.informatics.lab22.user.driver.Driver;
import ru.itis.informatics.lab22.vehicle.Vehicle;

public class Trip {
	private final Client client;
	private final Vehicle vehicle;
	private final Driver driver;
	private final Details details;

	public Trip(Client client, Vehicle vehicle, Driver driver, Details details) {
		this.client = client;
		this.vehicle = vehicle;
		this.driver = driver;
		this.details = details;
	}

	public Client getClient() {
		return client;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Driver getDriver() {
		return driver;
	}

	public Details getDetails() {
		return details;
	}

	@Override
	public String toString() {
		return "TRIP[" +
						getClient().getPhoneNumber() +
						", " + getClient().getName() +
						", " + getVehicle().getNumber() +
						", " + getDriver().getPhoneNumber() +
						", " + getDriver().getName() +
						", " + getDetails().getDepartureAddress() +
						", " + getDetails().getDestinationAddress() +
						", " + getDetails().getDepartureTime() +
						", " + getDetails().getDestinationTime() +
						"]";
	}
}
