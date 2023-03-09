package ru.itis.informatics.lab22.processor;

import ru.itis.informatics.lab22.domain.Trip;
import ru.itis.informatics.lab22.user.Client;
import ru.itis.informatics.lab22.details.Details;
import ru.itis.informatics.lab22.user.driver.Driver;
import ru.itis.informatics.lab22.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class TripProcessor {
	public List<Trip> getTripsFromLines(final List<String> lines) {
		List<Trip> trips = new ArrayList<>();

		for (final String line : lines) {
			final String[] data = line.split(";");
			final Details details = new Details(data[5], data[6], data[7], data[8]);
			final Client client = new Client(data[0], data[1]);
			final Vehicle vehicle = new Vehicle(data[2]);
			final Driver driver = new Driver(data[3], data[4], vehicle);
			trips.add(new Trip(client, vehicle, driver, details));
		}

		return new ArrayList<>(trips);
	}
}
