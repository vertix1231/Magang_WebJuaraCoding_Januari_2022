package com.juaracoding.magang.web.juaracoding.utils;

public enum TestCase {
	T1("test case Register dan Login ke akun https://shop.demoqa.com/");
	
	
	private String TestNama;

	TestCase(String value){
		this.TestNama  = value;
	}
	
	public String getTestNama() {
		return TestNama;
	}
	
	
	
}
