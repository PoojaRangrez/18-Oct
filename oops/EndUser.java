package com.xworkz.arrayobject;

public class EndUser {
	
	public static void displayInfo(PhonePay objs[]) {
		System.out.println("PhonePay Information");
		for(int i=0;i<objs.length;i++) {
			System.out.println(objs[i].name);
			System.out.println(objs[i].version);
			System.out.println(objs[i].releaseYear);
			System.out.println("------------------");
		}
	}

	public static void main(String[] args) {
		PhonePay phonePayV1=new PhonePay("Phone Pay","Phone Pay Version 1",2016);
		PhonePay phonePayV2=new PhonePay("Phone Pay","Phone Pay Version 2",2017);
		PhonePay phonePayV3=new PhonePay("Phone Pay","Phone Pay Version 3",2018);
		PhonePay phonePayV4=new PhonePay("Phone Pay","Phone Pay Version 4",2019);
		
		PhonePay objs[]= {phonePayV1,phonePayV2,phonePayV3,phonePayV4};
		EndUser.displayInfo(objs);
	}

}
