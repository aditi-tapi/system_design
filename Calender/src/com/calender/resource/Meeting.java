package com.calender.resource;

import java.util.Date;

public class Meeting {
	
	private TimeStamp timestamp;
	
	private int total_persons;
	private String meeting_room;
	
	public Meeting(TimeStamp timestamp, int total_persons, String meeting_room) {
		super();
		this.timestamp = timestamp;
		this.total_persons = total_persons;
		this.meeting_room = meeting_room;
	}
	
	
	public int getTotal_persons() {
		return total_persons;
	}
	public void setTotal_persons(int total_persons) {
		this.total_persons = total_persons;
	}
	public String getMeeting_room() {
		return meeting_room;
	}
	public void setMeeting_room(String meeting_room) {
		this.meeting_room = meeting_room;
	}
	@Override
	public String toString() {
		return "Meeting [start_time=" + timestamp + ", total_persons=" + total_persons
				+ ", meeting_room=" + meeting_room + "]";
	}


	public TimeStamp getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(TimeStamp timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
