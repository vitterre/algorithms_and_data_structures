package ru.itis.informatics.lab22.details;

public final class Details {

	private String departureAddress;
	private String destinationAddress;

	private String departureTime;
	private String destinationTime;

	public Details(String departureAddress, String destinationAddress, String departureTime, String destinationTime) {
		this.departureAddress = departureAddress;
		this.destinationAddress = destinationAddress;
		this.departureTime = departureTime;
		this.destinationTime = destinationTime;
	}

	public String getDepartureAddress() {
		return departureAddress;
	}

	public void setDepartureAddress(String departureAddress) {
		this.departureAddress = departureAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestinationTime() {
		return destinationTime;
	}

	public void setDestinationTime(String destinationTime) {
		this.destinationTime = destinationTime;
	}

	@Override
	public String toString() {
		return "Details{" +
						"departureAddress='" + departureAddress + '\'' +
						", destinationAddress='" + destinationAddress + '\'' +
						", departureTime='" + departureTime + '\'' +
						", destinationTime='" + destinationTime + '\'' +
						'}';
	}
}
