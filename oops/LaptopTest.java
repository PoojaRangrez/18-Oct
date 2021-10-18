package com.xworkz.arrayobject;

public class LaptopTest {
	
	public static void method(Laptop lappy[]) {
		System.out.println("Laptop information");
		for(int i=0;i<lappy.length;i++) {
			if(lappy[i].RAM>4) {
				System.out.println(lappy[i].brand);
				System.out.println(lappy[i].RAM);
				System.out.println(lappy[i].cost);
				System.out.println(lappy[i].processor);
				System.out.println("****************");
			}
		}
	}

	public static void main(String[] args) {
		Laptop lappyname1=new Laptop("Asus",4,20000,"CORE i3");
        Laptop lappyname2=new Laptop("Hp",6,45000,"CORE i5");
        Laptop lappyname3=new Laptop("Lenovo",4,34500,"CORE i3");
        Laptop lappyname4=new Laptop("Dell",8,62990,"CORE i5");
        
        Laptop lappy[]= {lappyname1,lappyname2,lappyname3,lappyname4};
        LaptopTest.method(lappy);
        
        
	}

}
