package com.juaracoding.magang.web.juaracoding.utils;

public enum TestCase {
	T1("Login in project web test ke https://dev.ptdika.com/juaracodingv1/admin/login"),
	T2("Dashboard Web Juara Coding");
	
	
	private String TestNama;

	TestCase(String value){
		this.TestNama  = value;
	}
	
	public String getTestNama() {
		return TestNama;
	}
	
	
	
}
