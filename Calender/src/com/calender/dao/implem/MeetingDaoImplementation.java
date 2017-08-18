package com.calender.dao.implem;

import java.util.List;

import com.calender.dao.ICalenderDao.IMeetingDao;
import com.calender.resource.Meeting;
import com.calender.resource.People;

public class MeetingDaoImplementation implements IMeetingDao {

	@Override
	public Meeting createMeeting(List<People> people) {
		
		for(int i =0 ;i<people.size();i++)
		{
			if(people.get(i).getAvailability().getStart_time().compareTo(people.get(i+1).getAvailability().getEnd_time()))
			{
				
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meeting updateMeeting(Meeting meeting) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Meeting deleteMeeting(Meeting meeting) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Meeting> getAllMeetings() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
