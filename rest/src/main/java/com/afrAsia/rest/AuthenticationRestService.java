package com.afrAsia.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.afrAsia.CommonUtils;
import com.afrAsia.entities.request.LoginDataRequest;
import com.afrAsia.entities.request.LoginRequest;
import com.afrAsia.entities.request.LogoutRequest;
import com.afrAsia.entities.response.LoginResponse;
import com.afrAsia.entities.response.LogoutResponse;
import com.afrAsia.entities.response.MessageHeader;
import com.afrAsia.entities.response.RequestError;
import com.afrAsia.service.AuthenticationService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Defines the skeleton for login, logout and session management service
 * 
 * @author Nyal Fernandes
 *
 */
@Component
@Path("{version}")
public class AuthenticationRestService 
{
	final static Logger debugLog = Logger.getLogger("debugLogger");
	final static Logger infoLog = Logger.getLogger("infoLogger");
	final static Logger errorLog = Logger.getLogger("errorLogger");
	
	private AuthenticationService authenticationService;
	
	public AuthenticationService getAuthenticationService() 
	{
		return authenticationService;
	}
	
	public void setAuthenticationService(AuthenticationService authenticationService) 
	{
		this.authenticationService = authenticationService;
	}

	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(@FormParam("userId") String userId,@FormParam("password") String password,@FormParam("deviceId") String deviceId,
			@FormParam("ipAddress") String ipAddress,@FormParam("userType") String userType)
	{
		infoLog.info(" Entered in login Service ");
		LoginResponse response = null;
		try
		{
			//LoginRequest loginRequest = CommonUtils.jsonStringToObject(loginStringRequest, LoginRequest.class);
			LoginDataRequest loginDataRequest = new LoginDataRequest();
			loginDataRequest.setUserId(userId);
			loginDataRequest.setPassword(password);
			loginDataRequest.setDeviceId(deviceId);
			loginDataRequest.setIpAddress(ipAddress);
			loginDataRequest.setUserType(userType);
			LoginRequest loginRequest = new LoginRequest();
			loginRequest.setData(loginDataRequest);
			response = authenticationService.login(loginRequest);
		}
		catch (Exception e)
		{
			errorLog.error("error in login(),AuthenticationRestService is :", e);
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("401");
			error.setCustomCode("ERR401");
			error.setRsn("Login failed.");
			msgHeader.setError(error);
			
			response = new LoginResponse();
			response.setMsgHeader(msgHeader);
			response.setData(null);
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		infoLog.info(" Exit from login Service ");
		debugLog.debug(" response of login Service is : "+response);
		return Response.ok(response).build();
	}
	
	@POST
	@Path("/logout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response logout(String logoutStringRequest, @HeaderParam("Authorization") String authToken)
	{
		infoLog.info(" Entered in logout Service ");
		LogoutResponse response = null;
		try
		{
			LogoutRequest logoutRequest = CommonUtils.jsonStringToObject(logoutStringRequest, LogoutRequest.class);
			response = authenticationService.logout(logoutRequest, authToken);
		}
		catch (Exception e)
		{
			errorLog.error("error in logout Service is :", e);
			
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("401");
			error.setCustomCode("ERR401");
			error.setRsn("Logout failed.");
			msgHeader.setError(error);
			
			response = new LogoutResponse();
			response.setMsgHeader(msgHeader);
			response.setData(null);
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		infoLog.info(" Exit from logout Service ");
		debugLog.debug(" response in logout Service is : "+response);
		return Response.ok(response).build();
	}
	
	@POST
	@Path("/checkSession")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkSession(String checkSessionRequest)
	{
		infoLog.info(" chekSession in checkSession(),AuthenticationRestService is : "+checkSessionRequest);
		LoginResponse response = null;
		try
		{
			
			LoginRequest loginRequest = CommonUtils.jsonStringToObject(checkSessionRequest, LoginRequest.class);
			infoLog.info("Value of checkSession request::" + loginRequest.toString());
			response = authenticationService.checkSession(loginRequest);
		}
		catch (Exception e)
		{
			//AfrAsiaLogger.infoLog("in catch of rest ====== ");
			e.printStackTrace();
			errorLog.error("error in  checkSession(),AuthenticationRestService is :", e);
			MessageHeader msgHeader = new MessageHeader();
			RequestError error = new RequestError();
			error.setCd("401");
			error.setCustomCode("ERR401");
			error.setRsn("Login failed.");
			msgHeader.setError(error);
			
			response = new LoginResponse();
			response.setMsgHeader(msgHeader);
			response.setData(null);
			return Response.status(Status.FORBIDDEN).entity(response).build();
		}
		infoLog.info(" response in checkSession(),AuthenticationRestService is : "+response);
		return Response.ok(response).build();
	}
	
	public static void main(String[] args) throws JsonProcessingException
	{
		LoginRequest req = new LoginRequest();
		LoginDataRequest data = new LoginDataRequest();
		data.setDeviceId("DevA");
		data.setIpAddress("10.1.1.1");
		data.setPassword("pass");
		data.setUserId("user");
		data.setUserType("RM");
		
		req.setData(data);
		
		ObjectMapper mapper = new ObjectMapper();
		//AfrAsiaLogger.infoLog(mapper.writeValueAsString(req));
		debugLog.debug("mapper.writeValueAsString(req) : "+mapper.writeValueAsString(req));
	}
}
