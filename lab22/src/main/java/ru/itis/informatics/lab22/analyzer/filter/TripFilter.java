package ru.itis.informatics.lab22.analyzer.filter;

import ru.itis.informatics.lab22.domain.Trip;

public interface TripFilter {
	boolean compare(final Trip one, final Trip another);
}
