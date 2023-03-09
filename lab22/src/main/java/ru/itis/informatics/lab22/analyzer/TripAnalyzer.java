package ru.itis.informatics.lab22.analyzer;

import ru.itis.informatics.lab22.analyzer.filter.TripFilter;
import ru.itis.informatics.lab22.domain.Trip;

import java.util.ArrayList;
import java.util.List;

public class TripAnalyzer {
	public List<Trip> getFilteredTrips(final List<Trip> trips, final TripFilter tripFilter) {
		final List<Trip> filteredTrips = new ArrayList<>();

		for (int i = 0; i < trips.size() - 1; i++) {
			Trip current = trips.get(i);
			Trip next = trips.get(i + 1);

			if (tripFilter.compare(current, next)) {
				filteredTrips.add(current);
				filteredTrips.add(next);
			}
		}

		return new ArrayList<>(filteredTrips);
	}
}
