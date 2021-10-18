package com.xworkz.arrayobject;

public class PhonePay {
	String name;
	String version;
	int releaseYear;
	
	public PhonePay(String name,String version,int releaseYear) {
		this.name=name;
		this.version=version;
		this.releaseYear=releaseYear;		
	}
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.version);
		System.out.println(this.releaseYear);
	}
}
