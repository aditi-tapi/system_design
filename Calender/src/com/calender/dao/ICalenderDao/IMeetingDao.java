package com.calender.dao.ICalenderDao;

import java.util.List;

import com.calender.resource.Meeting;
import com.calender.resource.People;

public interface IMeetingDao {
	
	public Meeting createMeeting(List<People> people);
	public Meeting updateMeeting(Meeting meeting);
	public Meeting deleteMeeting(Meeting meeting);
	public List<Meeting> getAllMeetings();
	

}
