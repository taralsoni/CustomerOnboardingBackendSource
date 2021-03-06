package com.afrAsia.dao;

import java.util.List;

import com.afrAsia.entities.masters.RMDetails;

public interface RMDetailsDao 
{

	public List<RMDetails> getRMDetails();
	
	public RMDetails getRMDetailById(String rmId, String userType);
	
	public RMDetails getRMDetailByRMId(String rmId) ;
	
	public void saveRmDetails(RMDetails obj);
	
	public void updateRmDetails(RMDetails rmDetails);
	
	public List<RMDetails> getRMDetailListByRMId(String rmId);
}
