package com.APIScenarios;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;
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
public class AuthenticationTest {
  @Test
  public void testBasicAuthentication()
  {
	  Response res=given()
			  		.auth().basic("postman","password")
	  
	  .when().get("https://postman-echo.com/basic-auth");
	 
	  
	  res.then().log().body();
	  
	  
  }
}
