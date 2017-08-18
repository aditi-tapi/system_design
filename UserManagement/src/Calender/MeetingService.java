package Calender;  

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;  
@Path("/MeetingService") 

public class MeetingService {  
	MeetingDao meetingDao = new MeetingDao();  
   private static final String SUCCESS_RESULT="<result>success</result>";
   private static final String FAILURE_RESULT="<result>failure</result>";
   
   @GET 
   @Path("/meetings") 
   @Produces(MediaType.APPLICATION_XML) 
   public List<Meeting> getMeetings(){ 
      return meetingDao.getAllMeetings(); 
   }
   
   
   @GET
   @Path("/meetings/{meetingid}")
   @Produces(MediaType.APPLICATION_XML)
   public Meeting getMeeting(@PathParam("meetingid") int meetingid){
      return meetingDao.getMeeting(meetingid);
   }

   @POST
   @Path("/meetings")
   @Produces(MediaType.APPLICATION_XML)
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
   public String createMeeting(@FormParam("mid") int mid,
		   @FormParam("start_time") int start_time,
		   @FormParam("end_time") int end_time,
      @FormParam("room") String room,
      @FormParam("persons") String persons,
      @Context HttpServletResponse servletResponse) throws IOException{
      Meeting meeting = new Meeting(mid,start_time,end_time,room, persons);
      int result = meetingDao.addMeeting(meeting);
      if(result == 1){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }

   @PUT
   @Path("/meetings")
   @Produces(MediaType.APPLICATION_XML)
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
   public String updateUser(@FormParam("mid") int mid,
		   @FormParam("start_time") int start_time,
		   @FormParam("end_time") int end_time,
      @FormParam("room") String room,
      @FormParam("calender") String calender,
      @Context HttpServletResponse servletResponse) throws IOException{
	   Meeting meeting = new Meeting(mid,start_time,end_time,room, calender);
      int result = meetingDao.updateMeeting(meeting);
      if(result == 1){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }

   @DELETE
   @Path("/meetings/{meetingid}")
   @Produces(MediaType.APPLICATION_XML)
   public String deleteMeeting(@PathParam("meetingid") int meetingid){
      int result = meetingDao.deleteMeeting(meetingid);
      if(result == 1){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }

   @OPTIONS
   @Path("/meetings")
   @Produces(MediaType.APPLICATION_XML)
   public String getSupportedOperations(){
      return "<operations>GET, PUT, POST, DELETE</operations>";
   }

}