package com.calender.dao.ICalenderDao;

import java.util.Date;

import com.calender.resource.Meeting;

public interface IPeopleDao {
	
	public Meeting getMeeting();
	public String getEmail();
	public Date getAvailability();

}
