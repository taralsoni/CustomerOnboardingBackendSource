package com.afrAsia.entities.response;

import java.io.Serializable;
import java.util.Date;

public class ComplianceApps implements Serializable {

	private static final long serialVersionUID = 1L;

	private String refNo;										

	private String recordId;

	private String customerName;

	private Date appSubmittedDate;

	private String appStatus;

	private String accountNumber;													

	private Date accountCreationDate;

	private String isAppLocked;

	private String lockedBy;

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getAppSubmittedDate() {
		return appSubmittedDate;
	}

	public void setAppSubmittedDate(Date appSubmittedDate) {
		this.appSubmittedDate = appSubmittedDate;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	public String getIsAppLocked() {
		return isAppLocked;
	}

	public void setIsAppLocked(String isAppLocked) {
		this.isAppLocked = isAppLocked;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	@Override
	public String toString() {
		return "ComplianceApps [refNo=" + refNo + ", recordId=" + recordId + ", customerName=" + customerName
				+ ", appSubmittedDate=" + appSubmittedDate + ", appStatus=" + appStatus + ", accountNumber="
				+ accountNumber + ", accountCreationDate=" + accountCreationDate + ", isAppLocked=" + isAppLocked
				+ ", lockedBy=" + lockedBy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((refNo == null) ? 0 : refNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplianceApps other = (ComplianceApps) obj;
		if (refNo == null) {
			if (other.refNo != null)
				return false;
		} else if (!refNo.equals(other.refNo))
			return false;
		return true;
	}

}
