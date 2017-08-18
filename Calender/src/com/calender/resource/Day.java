package com.calender.resource;

import java.util.List;

public class Day {
	private List<Meeting> meeting;

	public List<Meeting> getMeeting() {
		return meeting;
	}

	public void setMeeting(List<Meeting> meeting) {
		this.meeting = meeting;
	}
}
