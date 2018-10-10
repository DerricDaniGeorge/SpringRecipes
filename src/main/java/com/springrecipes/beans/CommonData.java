package com.springrecipes.beans;
import java.util.Properties;

public class CommonData {
public Properties commonProperties;
public String userOS;
public String userRegion;
private double randomNumber;
private String email;

public Properties getCommonProperties() {
	return commonProperties;
}
public void setCommonProperties(Properties commonProperties) {
	this.commonProperties = commonProperties;
}
public String getUserOS() {
	return userOS;
}
public void setUserOS(String userOS) {
	this.userOS = userOS;
}
public String getUserRegion() {
	return userRegion;
}
public void setUserRegion(String userRegion) {
	this.userRegion = userRegion;
}
public double getRandomNumber() {
	return randomNumber;
}
public void setRandomNumber(double randomNumber) {
	this.randomNumber = randomNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
