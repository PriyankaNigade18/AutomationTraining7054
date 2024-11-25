package com.ReastAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

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
 * 
 */

public class ResquestWithBDD 
{
  @Test
  public void testSingleObject()
  {
	  Response res=given()
	  
			  		.when().get("https://api.restful-api.dev/objects/7");
	  
//	  .then()
//	  .statusCode(200)
//	  .log().body();
	  
	  //to print json body inside console
	  res.then().log().body();
	  
	  //status code=200
	  
	  
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,200);
	  System.out.println("Status code matched! : code is: "+code);
	  
	  
	  //"price": 1849.99,
	  
	  double price=res.jsonPath().getDouble("data.price");
	  Assert.assertEquals(price,1849.99);
	  System.out.println("Price matched!: price is: "+price);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
