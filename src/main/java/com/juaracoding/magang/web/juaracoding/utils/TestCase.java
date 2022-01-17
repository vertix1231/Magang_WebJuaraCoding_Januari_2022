package com.juaracoding.magang.web.juaracoding.utils;

public enum TestCase {
	T1("Form Sign In"),
	T2("Dashboard Web Juara Coding"),
	T3("Home JuaraCoding");
	
	
	private String TestNama;

	TestCase(String value){
		this.TestNama  = value;
	}
	
	public String getTestNama() {
		return TestNama;
	}
	
	
	
}
