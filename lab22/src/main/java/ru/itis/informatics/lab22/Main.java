package ru.itis.informatics.lab22;

import ru.itis.informatics.lab22.analyzer.TripAnalyzer;
import ru.itis.informatics.lab22.domain.Trip;
import ru.itis.informatics.lab22.processor.TripProcessor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		final List<String> lines = Files.readAllLines(Paths.get("lab22/src/main/resources/input.csv"));

		final TripProcessor tripProcessor = new TripProcessor();

		final List<Trip> trips = tripProcessor.getTripsFromLines(lines);

		final List<Trip> result = new TripAnalyzer().getFilteredTrips(
						trips,
						(one, another) -> one.getDetails().getDepartureTime()
						                  .equals(another.getDetails().getDepartureTime()));

		result.forEach(System.out::println);
	}
}