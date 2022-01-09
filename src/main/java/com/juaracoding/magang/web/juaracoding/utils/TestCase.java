package com.juaracoding.magang.web.juaracoding.utils;

public enum TestCase {
	T1("test case Register dan Login ke akun https://shop.demoqa.com/"),
	T2("test case Pemakaian fitur cart dari barang yang akan dibeli"),
	T3("test case Fitur checkout pembelian seluruh item barang");
	
	
	private String TestNama;

	TestCase(String value){
		this.TestNama  = value;
	}
	
	public String getTestNama() {
		return TestNama;
	}
	
	
	
}
