package com.benefactor.controller.action;

import com.benefactor.core.user.common.UserDetails;
import com.benefactor.core.user.registration.UserRegistrationManager;

public class RegisterAction {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String title;
	private String company;
	private String phoneNumber;
	private String emailAddress;
	private String website;
	private String password;
	private String userName;

	public String execute() {

		UserRegistrationManager urm = new UserRegistrationManager();

		UserDetails ud = new UserDetails();
		ud.setAddress(getAddress());
		ud.setCity(getCity());
		ud.setCompany(getCompany());
		ud.setEmailAddress(getEmailAddress());
		ud.setFirstName(getFirstName());
		ud.setLastName(getLastName());
		ud.setPassword(getPassword());// password is set in plain. but when
										// retrieved MDF one is retrieved
		ud.setPhoneNumber(getPhoneNumber());
		ud.setState(getState());
		ud.setTitle(getTitle());
		ud.setUserName(getUserName());
		ud.setWebsite(getWebsite());
		ud.setZip(getZip());

		//urm.registerUser(ud);

		return urm.registerUser(ud) ? IActionConstants.REGISTER_SUCCESS : IActionConstants.REGISTER_FAILURE;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
