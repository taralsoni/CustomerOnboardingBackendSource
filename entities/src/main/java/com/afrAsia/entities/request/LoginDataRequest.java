package com.afrAsia.entities.request;

/**
 * 
 * @author nyalfernandes
 *
 */
public class LoginDataRequest 
{
	private String userId;
	private String password;
	private String deviceId;
	private String ipAddress;
	private String userType;
	private String refreshToken;

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "LoginDataRequest [userId=" + userId + ", password=" + password + ", deviceId=" + deviceId
				+ ", ipAddress=" + ipAddress + ", userType=" + userType + "]";
	}

}
