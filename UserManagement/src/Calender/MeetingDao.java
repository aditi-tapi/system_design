package Calender;  

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException;  
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.util.ArrayList; 
import java.util.List;  

public class MeetingDao { 
   public List<Meeting> getAllMeetings(){ 
      
      List<Meeting> meetingList = null; 
      try { 
         File file = new File("Meetings.dat"); 
         if (!file.exists()) { 
            Meeting meeting = new Meeting(1, 2, 3,  "Neo", "Jack"); 
            meetingList = new ArrayList<Meeting>(); 
            meetingList.add(meeting); 
            saveMeetingList(meetingList); 
         } 
         else{ 
            FileInputStream fis = new FileInputStream(file); 
            ObjectInputStream ois = new ObjectInputStream(fis); 
            meetingList = (List<Meeting>) ois.readObject(); 
            ois.close(); 
         } 
      } catch (IOException e) { 
         e.printStackTrace(); 
      } catch (ClassNotFoundException e) { 
         e.printStackTrace(); 
      }   
      return meetingList; 
   } 
   public Meeting getMeeting(int id){
	      List<Meeting> meetings = getAllMeetings();

	      for(Meeting meeting: meetings){
	         if(meeting.getMeeting_id() == id){
	            return meeting;
	         }
	      }
	      return null;
	   }

	   public int addMeeting(Meeting pMeeting){
	      List<Meeting> meetingList = getAllMeetings();
	      boolean meetingExists = false;
	      for(Meeting meeting: meetingList){
	         if(meeting.getMeeting_id() == pMeeting.getMeeting_id()){
	            meetingExists = true;
	            break;
	         }
	      }		
	      if(!meetingExists){
	         meetingList.add(pMeeting);
	         saveMeetingList(meetingList);
	         return 1;
	      }
	      return 0;
	   }

	   public int updateMeeting(Meeting pMeeting){
	      List<Meeting> meetingList = getAllMeetings();

	      for(Meeting meeting: meetingList){
	    	 
	         if(meeting.getMeeting_id() == pMeeting.getMeeting_id()){
	        	 for(Meeting meeting1: meetingList)
	        		 if((meeting1.getEnd()>pMeeting.getStart() && pMeeting.getStart()>meeting1.getStart()) || (meeting1.getEnd()>pMeeting.getEnd() && pMeeting.getEnd()>meeting1.getStart()))
	        			 return 0;
	        	int index = meetingList.indexOf(meeting);			
	            meetingList.set(index, pMeeting);
	            saveMeetingList(meetingList);
	            return 1;
	         }
	      }		
	      return 0;
	   }

	   public int deleteMeeting(int id){
	      List<Meeting> meetingList = getAllMeetings();

	      for(Meeting meeting: meetingList){
	         if(meeting.getMeeting_id() == id){
	            int index = meetingList.indexOf(meeting);			
	            meetingList.remove(index);
	            saveMeetingList(meetingList);
	            return 1;   
	         }
	      }		
	      return 0;
	   }

	   private void saveMeetingList(List<Meeting> meetingList){
	      try {
	         File file = new File("Meetings.dat");
	         FileOutputStream fos;

	         fos = new FileOutputStream(file);

	         ObjectOutputStream oos = new ObjectOutputStream(fos);		
	         oos.writeObject(meetingList);
	         oos.close();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
   
   
}