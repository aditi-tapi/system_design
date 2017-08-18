package com.calender.resource;

import java.util.Date;

public class People {
	public People(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	private String name;
	private String email;
	private TimeStamp availability;
	private Meeting meeting;
	private Calender calender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", email=" + email + "]";
	}
	public Meeting getMeeting() {
		return meeting;
	}
	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}
	public Calender getCalender() {
		return calender;
	}
	public void setCalender(Calender calender) {
		this.calender = calender;
	}
	public TimeStamp getAvailability() {
		return availability;
	}
	public void setAvailability(TimeStamp availability) {
		this.availability = availability;
	}
	

}
