package Calender; 

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class WebServiceTester  {

   private Client client;
   private String REST_SERVICE_URL = "http://localhost:8080/UserManagement/rest/UserService/users";
   //private String REST_SERVICE_URL_MEET = "http://localhost:8080/UserManagement/rest/MeetingService/meetings";
   private static final String SUCCESS_RESULT="<result>success</result>";
   private static final String PASS = "pass";
   private static final String FAIL = "fail";

   private void init(){
      this.client = ClientBuilder.newClient();
   }

   public static void main(String[] args){
      WebServiceTester tester = new WebServiceTester();
      //initialize the tester
      tester.init();
      //test get all users Web Service Method
     tester.testGetAllUsers();
      //test get user Web Service Method 
      tester.testGetUser();
      //test update user Web Service Method
      tester.testUpdateUser();
      //test add user Web Service Method
      tester.testAddUser();
      //test delete user Web Service Method
      tester.testDeleteUser();
      
      
      //tester.init();
      //test get all users Web Service Method
      //tester.testGetAllMeetings();
      //test get user Web Service Method 
      //tester.testGetMeeting();
      //test update user Web Service Method
      //tester.testUpdateMeeting();
      //test add user Web Service Method
      //tester.testAddMeeting();
      //test delete user Web Service Method
      //tester.testDeleteMeeting();
   }
   //Test: Get list of all users
   //Test: Check if list is not empty
   private void testGetAllUsers(){
      GenericType<List<User>> list = new GenericType<List<User>>() {};
      List<User> users = client
         .target(REST_SERVICE_URL)
         .request(MediaType.APPLICATION_XML)
         .get(list);
      String result = PASS;
      if(users.isEmpty()){
         result = FAIL;
      }
      System.out.println("Test case name: testGetAllUsers, Result: " + result );
   }
   
//   private void testGetAllMeetings(){
//	      GenericType<List<Meeting>> list = new GenericType<List<Meeting>>() {};
//	      List<Meeting> meetings = client
//	         .target(REST_SERVICE_URL_MEET)
//	         .request(MediaType.APPLICATION_XML)
//	         .get(list);
//	      String result = PASS;
//	      if(meetings.isEmpty()){
//	         result = FAIL;
//	      }
//	      System.out.println("Test case name: testGetAllMeetings, Result: " + result );
//	   }
   //Test: Get User of id 1
   //Test: Check if user is same as sample user
   private void testGetUser(){
      User sampleUser = new User();
      sampleUser.setId(1);

      User user = client
         .target(REST_SERVICE_URL)
         .path("/{userid}")
         .resolveTemplate("userid", 1)
         .request(MediaType.APPLICATION_XML)
         .get(User.class);
      String result = FAIL;
      if(sampleUser != null && sampleUser.getId() == user.getId()){
         result = PASS;
      }
      System.out.println("Test case name: testGetUser, Result: " + result );
   }
//   private void testGetMeeting(){
//	      Meeting sampleMeeting = new Meeting();
//	      sampleMeeting.setMeeting_id(1);
//
//	      Meeting meeting = client
//	         .target(REST_SERVICE_URL_MEET)
//	         .path("/{meetingid}")
//	         .resolveTemplate("meetingid", 1)
//	         .request(MediaType.APPLICATION_XML)
//	         .get(Meeting.class);
//	      String result = FAIL;
//	      if(sampleMeeting != null && sampleMeeting.getMeeting_id() == meeting.getMeeting_id()){
//	         result = PASS;
//	      }
//	      System.out.println("Test case name: testGetUser, Result: " + result );
//	   }
   //Test: Update User of id 1
   //Test: Check if result is success XML.
   private void testUpdateUser(){
      Form form = new Form();
      form.param("id", "1");
      form.param("name", "suresh");
      form.param("profession", "clerk");

      String callResult = client
         .target(REST_SERVICE_URL)
         .request(MediaType.APPLICATION_XML)
         .put(Entity.entity(form,
            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
            String.class);
      String result = PASS;
      if(!SUCCESS_RESULT.equals(callResult)){
         result = FAIL;
      }

      System.out.println("Test case name: testUpdateMeeting, Result: " + result );
   }
   
//   private void testUpdateMeeting(){
//	      Form form = new Form();
//	      form.param("mid", "2");
//	      form.param("start_time", "3");
//	      form.param("end_time", "4");
//	      form.param("room", "neonei");
//	      form.param("persons", "jack");
//
//	      String callResult = client
//	         .target(REST_SERVICE_URL_MEET)
//	         .request(MediaType.APPLICATION_XML)
//	         .put(Entity.entity(form,
//	            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
//	            String.class);
//	      String result = PASS;
//	      if(!SUCCESS_RESULT.equals(callResult)){
//	         result = FAIL;
//	      }
//
//	      System.out.println("Test case name: testUpdateUser, Result: " + result );
//	   }
   //Test: Add User of id 2
   //Test: Check if result is success XML.
   private void testAddUser(){
      Form form = new Form();
      form.param("id", "2");
      form.param("name", "naresh");
      form.param("profession", "clerk");

      String callResult = client
         .target(REST_SERVICE_URL)
         .request(MediaType.APPLICATION_XML)
         .post(Entity.entity(form,
            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
            String.class);
   
      String result = PASS;
      if(!SUCCESS_RESULT.equals(callResult)){
         result = FAIL;
      }

      System.out.println("Test case name: testAddMeeting, Result: " + result );
   }
   
//   private void testAddMeeting(){
//	      Form form = new Form();
//	      form.param("mid", "2");
//	      form.param("start_time", "2");
//	      form.param("end_time", "3");
//	      form.param("room", "neo");
//	      form.param("persons", "john");
//
//	      String callResult = client
//	         .target(REST_SERVICE_URL_MEET)
//	         .request(MediaType.APPLICATION_XML)
//	         .post(Entity.entity(form,
//	            MediaType.APPLICATION_FORM_URLENCODED_TYPE),
//	            String.class);
//	   
//	      String result = PASS;
//	      if(!SUCCESS_RESULT.equals(callResult)){
//	         result = FAIL;
//	      }
//
//	      System.out.println("Test case name: testAddMeeting, Result: " + result );
//	   }
   //Test: Delete User of id 2
   //Test: Check if result is success XML.
   private void testDeleteUser(){
      String callResult = client
         .target(REST_SERVICE_URL)
         .path("/{userid}")
         .resolveTemplate("userid", 2)
         .request(MediaType.APPLICATION_XML)
         .delete(String.class);

      String result = PASS;
      if(!SUCCESS_RESULT.equals(callResult)){
         result = FAIL;
      }

      System.out.println("Test case name: testDeleteUser, Result: " + result );
   }
   
//   private void testDeleteMeeting(){
//	      String callResult = client
//	         .target(REST_SERVICE_URL_MEET)
//	         .path("/{meetingid}")
//	         .resolveTemplate("meetingid", 2)
//	         .request(MediaType.APPLICATION_XML)
//	         .delete(String.class);
//
//	      String result = PASS;
//	      if(!SUCCESS_RESULT.equals(callResult)){
//	         result = FAIL;
//	      }
//
//	      System.out.println("Test case name: testDeleteMeeting, Result: " + result );
//	   }
}




