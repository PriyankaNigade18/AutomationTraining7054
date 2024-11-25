package com.ReastAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testPojo.AuthenticatePojo;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
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
 * 
 */
public class WaysTORequestPayload {
  @Test
  public void createTokenWithHashMap()
  {
	  System.out.println("Token created with Hashmap");
	  //RequestPayload
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("username","admin");
	  data.put("password","password123");
	  
	  
Response res=given()
	  .header("Content-Type","application/json")
	  .body(data)
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	//get the response in console
	res.then().log().body();

	//status code
	int code=res.getStatusCode();
	Assert.assertEquals(code,200);
	System.out.println("Status code is: "+code);

	  //get the token
	String tokenvalue=res.jsonPath().getString("token");
	System.out.println("token generated is: "+tokenvalue);
	  

	  
  }
  
  @Test
  public void createTokenUsingPOJO()
  {
	  
	  //Request payload
	  AuthenticatePojo auth=new AuthenticatePojo();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	Response res=given()
	  .header("Content-Type","application/json")
	  .body(auth)
	  
	  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	//get the response
	res.then().log().body();
	
	
	//to get the status code
	System.out.println(res.getStatusCode());
	
	//to get the token
	String tokenvalue=res.jsonPath().getString("token");
	
	System.out.println("Generated token is: "+tokenvalue);
	
	
	
	
  }
  
  
  
  
  
  
  
  
  
}
