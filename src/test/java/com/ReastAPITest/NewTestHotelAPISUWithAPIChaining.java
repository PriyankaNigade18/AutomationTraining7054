package com.ReastAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testPojo.AuthenticatePojo;
import com.testPojo.BookingDates;
import com.testPojo.BookingDetails;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
/*
 * given()-prerequisite
 * ------------------------------
 * header,cookies,request payload,authorization,path parameters,query parmeters
 * 
 * when()- Request
 * -----------------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then()- validation 
 * ---------------------------
 * status code,message,response time,payload,headers,cookies
 * 
 * 
 */
public class NewTestHotelAPISUWithAPIChaining 
{
	
	//global variables-instance
	int id;
	String tokenvalue;
	
  @Test(priority=1)
  public void getAllBookingIds()
  {
	  System.out.println("Get all Booking ids");
	  
	 Response res=given()
	  
	        .when().get("https://restful-booker.herokuapp.com/booking");
	 
	 //status code
	 int code=res.getStatusCode();
	 Assert.assertEquals(code,200);
	 System.out.println("Status code is: "+code);
	 
	 //print json body in console
	 res.then().log().body();
	 
	  }
  
  
  @Test(priority=2)
  public void createNewBooking()
  {
	  //Request payload
	  
	  
	  BookingDates dates=new BookingDates();
	  dates.setCheckin("2024-11-26");
	  dates.setCheckout("2024-11-27");
	  
	  BookingDetails data=new BookingDetails();
	  data.setFirstname("Jay");
	  data.setLastname("Nigade");
	  data.setTotalprice(9999);
	  data.setDepositpaid(true);
	  data.setBookingdates(dates);
	  data.setAdditionalneeds("lunch");
	  	  
	  
	  System.out.println("To create new Booking");
	Response res=given()
	  .header("Content-Type","application/json")
	  .body(data)
	  
	  .when().post("https://restful-booker.herokuapp.com/booking");
	
	//get the log in console
	res.then().log().body();
	
	
	//bookingid
	 id=res.jsonPath().getInt("bookingid");
	 System.out.println("Booking id is: "+id);
	 
	  
  }
  
  @Test(priority=3)
  public void createToken()
  {
	  //Request payload
	  AuthenticatePojo auth=new AuthenticatePojo();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	Response res=given()
	  .header("Content-Type","application/json")
	  .body(auth)
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	
	//status code
	int code=res.getStatusCode();
	Assert.assertEquals(code,200);
	System.out.println("Status code is: "+code);
	
	//get the all log [headers+cookies+payload]
	
	//res.then().log().all();
	
	//get the body
	res.then().log().body();
	
	//get the headers
	//res.then().log().headers();
	
	//get token 
	tokenvalue=res.jsonPath().getString("token");
	System.out.println("Generated token is: "+tokenvalue);
	
  }
  
  //updating with same id and same token-dynamic 
  @Test(priority=4)
  public void partialUpdate()
  {
	  System.out.println("Partial updating booking for same id: "+id);
	  
	  BookingDates dates=new BookingDates();
	  dates.setCheckin("2024-11-26");
	  dates.setCheckout("2024-11-27");
	  
	  //Request payload
	  BookingDetails data=new BookingDetails();
	  data.setFirstname("Sarang");
	  data.setLastname("shaha");
	  data.setBookingdates(dates);
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .header("Accept","application/json")
	  .header("Cookie","token="+tokenvalue)
	  .body(data)
	  
	  .when().patch("https://restful-booker.herokuapp.com/booking/"+id);
	  
	  //status code
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,200);
	  System.out.println("status code is: "+code);
	  
	  //get the body
	  res.then().log().body();
	  
	  
	   }
  
  
  @Test(priority=5)
  public void deleteBooking()
  {
	  System.out.println("Delete the booing for same id: "+id);
 Response res=given()
	  .header("Content-Type","application/json")
	  .header("Cookie","token="+tokenvalue)
	  
	  .when().delete("https://restful-booker.herokuapp.com/booking/"+id);
 
 	
 
 System.out.println("status line is: "+res.getStatusLine());
 
 		//get the log
 	res.then().log().body();
 	
 	//status code should 201
 	int code=res.getStatusCode();
 	Assert.assertEquals(code,201);
 	System.out.println("Status code is matched: code is: "+code);
 
 
 
 
 
 
 
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
