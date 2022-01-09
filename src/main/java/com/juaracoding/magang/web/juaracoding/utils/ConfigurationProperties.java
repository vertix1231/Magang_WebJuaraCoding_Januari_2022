package com.juaracoding.magang.web.juaracoding.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String myusername;
	
	@Value("${password}")
	private String password;
	
	@Value("${email}")
	private String email;
	
	@Value("${hellokamuakun}")
	private String hellokamuakun;
	
	@Value("${thxfortheorder}")
	private String thxfortheorder;
	
	

	public String getThxfortheorder() {
		return thxfortheorder;
	}

	public String getHellokamuakun() {
		return hellokamuakun;
	}

	public String getBrowser() {
		return browser;
	}

	public String getMyusername() {
		return myusername;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}
	

	
	
	
}
