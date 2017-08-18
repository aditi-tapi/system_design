import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "meeting") 

public class Meeting implements Serializable {  
   private static final long serialVersionUID = 1L; 
   private int meeting_id;
   
   private int start_time;
   private int end_time;
   private String room; 
   private String[] persons;  
   public Meeting(){} 
    
   public Meeting(int meeting_id,int start_time, int end_time, String room, String[] persons){  
	  this.meeting_id = meeting_id;
      this.start_time = start_time; 
      this.end_time = end_time; 
      this.room = room;
      this.persons = persons;
   }  
   
   public int getMeeting_id() {
		return meeting_id;
	}
   @XmlElement
	public void setMeeting_id(int meeting_id) {
		this.meeting_id = meeting_id;
	}
   
   public int getStart() { 
      return start_time; 
   }  
   @XmlElement 
   public void setStart(int start_time) { 
      this.start_time = start_time; 
   } 
   public int getEnd() { 
	      return end_time; 
	   }  
  @XmlElement 
   public void setEnd(int end_time) { 
	      this.end_time = end_time; 
	   }
   public String getRoom() { 
      return room; 
   } 
   @XmlElement
   public void setRoom(String room) { 
      this.room = room; 
   } 
   public String[] getPersons() { 
      return persons; 
   } 
   @XmlElement 
   public void setPersons(String[] persons) { 
      this.persons = persons; 
   }   
   @Override
   public boolean equals(Object object){
	      if(object == null){
	         return false;
	      }else if(!(object instanceof Meeting)){
	         return false;
	      }else {
	         Meeting user = (Meeting)object;
	         if(start_time == user.getStart() && end_time == user.getEnd()
	            && room.equals(user.getRoom())
	            && persons.equals(user.getPersons())
	         ){
	            return true;
	         }			
	      }
	      return false;
	   }
} 