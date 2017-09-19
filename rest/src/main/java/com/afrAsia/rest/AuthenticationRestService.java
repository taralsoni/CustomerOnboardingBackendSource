package com.afrAsia.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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
import com.afrAsia.Utils.AfrAsiaLogger;
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
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(String loginStringRequest)
	{
		infoLog.info(" loginStringRequest in login(),AuthenticationRestService is : "+loginStringRequest);
		LoginResponse response = null;
		try
		{
			
			LoginRequest loginRequest = CommonUtils.jsonStringToObject(loginStringRequest, LoginRequest.class);
			infoLog.info("Value of login request::" + loginRequest.toString());
			response = authenticationService.login(loginRequest);
		}
		catch (Exception e)
		{
			//AfrAsiaLogger.infoLog("in catch of rest ====== ");
			//e.printStackTrace();
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
		infoLog.info(" response in login(),AuthenticationRestService is : "+response);
		return Response.ok(response).build();
	}
	
	@POST
	@Path("/logout")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response logout(String logoutStringRequest, @HeaderParam("Authorization") String authToken)
	{
		infoLog.info(" logoutStringRequest in logout(),AuthenticationRestService is : "+logoutStringRequest);
		LogoutResponse response = null;
		try
		{
			LogoutRequest logoutRequest = CommonUtils.jsonStringToObject(logoutStringRequest, LogoutRequest.class);
			response = authenticationService.logout(logoutRequest, authToken);
		}
		catch (Exception e)
		{
			errorLog.error("error in logout(),AuthenticationRestService is :", e);
			e.printStackTrace();
			//AfrAsiaLogger.errorLog("error :", e);
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
		infoLog.info(" response in logout(),AuthenticationRestService is : "+response);
		return Response.ok(response).build();
	}
	
	@GET
	@Path("/checkSession")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkSession()
	{
		infoLog.info(" in checkSession(),AuthenticationRestService ");
		try
		{
			
		}
		catch (Exception e)
		{
			
		}
		
		return Response.ok().build();
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
		infoLog.info("mapper.writeValueAsString(req) : "+mapper.writeValueAsString(req));
	}
}
