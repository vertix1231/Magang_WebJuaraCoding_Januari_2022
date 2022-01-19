package com.juaracoding.magang.web.juaracoding.utils;

public enum TestCase {
	T1("Form Sign In"),
	T2("Dashboard Web Juara Coding"),
	T3("Home JuaraCoding"),
	T4("Learning JuaraCoding"),
	T5("Blog JuaraCoding"),
	T6("Contact Massage JuaraCoding"),
	T7("Transaction JuaraCoding"),
	T8("User JuaraCoding"),
	T9("Program JuaraCoding"),
	T10("Gallery JuaraCoding"),
	T11("Setting JuaraCoding");
	
	
	private String TestNama;

	TestCase(String value){
		this.TestNama  = value;
	}
	
	public String getTestNama() {
		return TestNama;
	}
	
	
	
}
