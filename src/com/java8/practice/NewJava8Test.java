package com.java8.practice;

import java.util.function.*;

public class NewJava8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f = i->i*i;
		System.out.println(f.apply(5));
		
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(10));
		
		CommonInterface i = ()->System.out.println("Tested Functional Interface");
		i.commonMethod();
		
		CommonInterface ci = new CommonInterface() {
			
			@Override
			public void commonMethod() {
				// TODO Auto-generated method stub
				System.out.println("Other way of Implementing");
			}
		};
		
		ci.commonMethod();
		
		Predicate<String> p1;
		
		SecondInterface si = (a,b)->a+b;
		int sum = si.add(10, 20);
		System.out.println(sum);
	}

}
@FunctionalInterface
interface CommonInterface{
	public void commonMethod();
}

@FunctionalInterface
interface SecondInterface{
	public int add(int a, int b);
}