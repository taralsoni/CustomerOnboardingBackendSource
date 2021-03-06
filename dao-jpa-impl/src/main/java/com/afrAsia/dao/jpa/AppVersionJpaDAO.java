package com.afrAsia.dao.jpa;

import com.afrAsia.dao.AppVersionDao;
import com.afrAsia.entities.jpa.AppVersion;
import com.afrAsia.entities.jpa.DeviceFootPrint;

public interface AppVersionJpaDAO extends AppVersionDao {
	public AppVersion getAppVersionDetails(String platform,String appVersion);
	public AppVersion getLatestVersion(String platform);
	public DeviceFootPrint storeDeviceFootPrint(DeviceFootPrint deviceFootPrint);
	public DeviceFootPrint getDeviceFootPrint(String deviceId);
	public DeviceFootPrint updateDeviceFootPrint(DeviceFootPrint deviceFootPrint);
}
