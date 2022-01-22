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
	T11("Setting JuaraCoding"),
	T12("Testing Home Page"),
	T13("Testing Bootcamp Page"),
	T14("Testing Syllabus Page"),
	T15("Testing Course Page"),
	T16("Testing About Page"),
	T17("Testing Blog Page"),
	T18("Testing Contact Page"),
	T19("Testing Register Page");
	
	
	private String TestNama;

	TestCase(String value){
		this.TestNama  = value;
	}
	
	public String getTestNama() {
		return TestNama;
	}
	
	
	
}
