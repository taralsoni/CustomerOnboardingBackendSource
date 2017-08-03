package com.afrAsia.entities.request;

import java.io.Serializable;


public class NomineeInfo implements Serializable {

	public NomineeInfo() {
		super();
	}
	String nomineeName;
	String nomineeId;
	Long nomineeCallbkNo;
	String nomineeEmail;
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(String nomineeId) {
		this.nomineeId = nomineeId;
	}
	public Long getNomineeCallbkNo() {
		return nomineeCallbkNo;
	}
	public void setNomineeCallbkNo(Long nomineeCallbkNo) {
		this.nomineeCallbkNo = nomineeCallbkNo;
	}
	public String getNomineeEmail() {
		return nomineeEmail;
	}
	public void setNomineeEmail(String nomineeEmail) {
		this.nomineeEmail = nomineeEmail;
	}
	@Override
	public String toString() {
		return "NomineeInfo [nomineeName=" + nomineeName + ", nomineeId=" + nomineeId + ", nomineeCallbkNo="
				+ nomineeCallbkNo + ", nomineeEmail=" + nomineeEmail + "]";
	}
	
	
	
	
}

