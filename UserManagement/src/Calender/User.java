package Calender;  

import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "user") 

public class User implements Serializable {  
   private static final long serialVersionUID = 1L; 
   private int id; 
   private String name; 
   private Calender calender; 
   public User(){} 
    
   public User(int id, String name, String profession){  
      this.id = id; 
      this.name = name; 
      this.calender = calender; 
   }  

   public Calender getCalender() {
	return calender;
}
   
  @XmlElement 
public void setCalender(Calender calender) {
	this.calender = calender;
}
public int getId() { 
    return id; 
 } 

@XmlElement 
   public void setId(int id) { 
      this.id = id; 
   } 
   public String getName() { 
      return name; 
   } 
   @XmlElement
   public void setName(String name) { 
      this.name = name; 
   } 
      
   @Override
   public boolean equals(Object object){
	      if(object == null){
	         return false;
	      }else if(!(object instanceof User)){
	         return false;
	      }else {
	         User user = (User)object;
	         if(id == user.getId()
	            && name.equals(user.getName())
	            && calender.equals(user.getCalender())
	         ){
	            return true;
	         }			
	      }
	      return false;
	   }
} 