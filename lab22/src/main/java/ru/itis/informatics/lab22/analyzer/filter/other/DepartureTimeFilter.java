package ru.itis.informatics.lab22.analyzer.filter.other;

import ru.itis.informatics.lab22.analyzer.filter.TripFilter;
import ru.itis.informatics.lab22.domain.Trip;

public class DepartureTimeFilter implements TripFilter {
	@Override
	public boolean compare(Trip one, Trip another) {
		return one.getDetails().getDepartureTime()
						.equals(another.getDetails().getDepartureTime());
	}
}
