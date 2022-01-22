package com.juaracoding.magang.web.juaracoding.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;

	// ADMIN WEB JUARA CODING
	@Value("${myusername_admin}")
	private String myusername_admin;

	@Value("${password_admin}")
	private String password_admin;

	// USER WEB JUARA CODING

	// Email Suscribe
	@Value("${emailuser}")
	private String email_user;

	//
	@Value("${courseuser}")
	private String course_user;

	// Contact
	@Value("${fullnameuser}")
	private String fullname_user;

	@Value("${email2user}")
	private String email2_user;

	@Value("${phoneuser}")
	private String phone_user;

	@Value("${subjectuser}")
	private String subject_user;

	@Value("${messageuser}")
	private String message_user;

	// Register Form
	@Value("${firstNameuser}")
	private String firstName_user;

	@Value("${lastNameuser}")
	private String lastName_user;

	@Value("${emailStudentsuser}")
	private String emailStudents_user;

	@Value("${dateOfBirthuser}")
	private String dateOfBirth_user;

	@Value("${addressuser}")
	private String address_user;

	@Value("${cityuser}")
	private String city_user;

	@Value("${postCodeuser}")
	private String postCode_user;

	@Value("${mobilePhoneuser}")
	private String mobilePhone_user;

	@Value("${relativesPhoneuser}")
	private String relativesPhone_user;

	@Value("${motivationuser}")
	private String motivation_user;

	public String getBrowser() {
		return browser;
	}

	public String getMyusername_admin() {
		return myusername_admin;
	}

	public String getPassword_admin() {
		return password_admin;
	}

	public String getEmail_user() {
		return email_user;
	}

	public String getCourse_user() {
		return course_user;
	}

	public String getFullname_user() {
		return fullname_user;
	}

	public String getEmail2_user() {
		return email2_user;
	}

	public String getPhone_user() {
		return phone_user;
	}

	public String getSubject_user() {
		return subject_user;
	}

	public String getMessage_user() {
		return message_user;
	}

	public String getFirstName_user() {
		return firstName_user;
	}

	public String getLastName_user() {
		return lastName_user;
	}

	public String getEmailStudents_user() {
		return emailStudents_user;
	}

	public String getDateOfBirth_user() {
		return dateOfBirth_user;
	}

	public String getAddress_user() {
		return address_user;
	}

	public String getCity_user() {
		return city_user;
	}

	public String getPostCode_user() {
		return postCode_user;
	}

	public String getMobilePhone_user() {
		return mobilePhone_user;
	}

	public String getRelativesPhone_user() {
		return relativesPhone_user;
	}

	public String getMotivation_user() {
		return motivation_user;
	}
	
	
	
	

}
