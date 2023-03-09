package ru.itis.informatics.lab22.user;

public class Client {
	private String phoneNumber;
	private String name;

	public Client(String phoneNumber, String name) {
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
