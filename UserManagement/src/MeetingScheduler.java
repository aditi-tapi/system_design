
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MeetingScheduler {

	private Map<TimeSlot, Meeting> meetings = new HashMap<>();
	
	public static void main(String[] args)
	{
		MeetingScheduler scheduler = new MeetingScheduler();
		System.out.println(scheduler.add(new Meeting("First meeting"), TimeSlot.createNewSlot("03/01/2013 08:00", "03/01/2013 08:30")));
		System.out.println(scheduler.add(new Meeting("Second meeting"), TimeSlot.createNewSlot("03/01/2013 08:30", "03/01/2013 09:30")));
		
		System.out.println(scheduler.add(new Meeting("Third meeting"), TimeSlot.createNewSlot("03/01/2013 07:30", "03/01/2013 08:15")));
		
		System.out.println(scheduler.add(new Meeting("Fourth meeting"), TimeSlot.createNewSlot("03/01/2013 09:15", "03/01/2013 09:45")));
		
		scheduler.printAllMeetings();
	}
	
	

	private void printAllMeetings() {
		System.out.println(meetings);
	}

	public boolean add(Meeting meeting, TimeSlot timeSlot)
	{
		for(TimeSlot slot : meetings.keySet())
		{
			if (slot.collidesWith(timeSlot))
			{
				return false;
			}
		}
		meetings.put(timeSlot, meeting);
		return true;
	}
	
	public static class Meeting
	{
		private String title;
		
		public Meeting(String title)
		{
			this.title = title;
		}
		
		public String toString()
		{
			return title;
		}
	}
	public static class TimeSlot
	{
		private Date beginDate;
		private Date endDate;
		
		public TimeSlot(Date beginDate, Date endDate) {
			this.beginDate = beginDate;
			this.endDate = endDate;
		}

		public boolean collidesWith(TimeSlot timeSlot) {
			
			if (timeSlot.beginDate.getTime() > beginDate.getTime()
					&& timeSlot.beginDate.getTime() < endDate.getTime())
			{
				return true;
			}
			
			if (timeSlot.endDate.getTime() > beginDate.getTime()
					&& timeSlot.endDate.getTime() < endDate.getTime())
			{
				return true;
			}
			return false;
		}
		
		public static TimeSlot createNewSlot(String beginDate, String endDate)
		{
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm");
			try {
				return new TimeSlot(format.parse(beginDate), format.parse(endDate));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public String toString()
		{
			return "Begin Date = " + beginDate.toString() + ", End Date = " + endDate.toString();
		}

	}
	}
