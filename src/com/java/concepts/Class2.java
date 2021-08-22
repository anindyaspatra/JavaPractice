package com.java.concepts;

import java.io.IOException;

public class Class2 extends Throwable{
	
	Class2(String exceptionString){
		String newString = "NewlyAdded"+exceptionString;
		System.out.println();
	}
	
//	int id;
//	String name;
//	String title;
//	Class2(int id, String name){
//		this.id = id;
//		this.name = name;
//	}
//
//	Class2(int id, String name, String title){
//		this.id = id;
//		this.name = name;
//		this.title = title;
//	}
    public static void main(String args[]) 
    {
//    	//Class1.display();
//    	Class2 test = new Class2(1, "One");
//    	Class2 test2 = new Class2(2, "Two", "TitleTwo");
//    	
//    	System.out.println(test2.title);
    	
    	
    	try{
    		//throw new Class2("Test Exception");
    	}catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    }
}
