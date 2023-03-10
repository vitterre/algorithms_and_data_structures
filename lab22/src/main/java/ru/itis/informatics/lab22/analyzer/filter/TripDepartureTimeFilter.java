package ru.itis.informatics.lab22.analyzer.filter;

import ru.itis.informatics.lab22.domain.Trip;

public class TripDepartureTimeFilter implements TripFilter {
	@Override
	public boolean compare(Trip one, Trip another) {
		return one.getDetails().getDepartureTime()
						.equals(another.getDetails().getDepartureTime());
	}
}
