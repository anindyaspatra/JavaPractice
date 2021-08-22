package problems;

import java.util.*;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Problem3 {
	String name;
	int id;

	Problem3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////		WebDriver driver = new ChromeDriver();
////		driver.get("ApplicationURL");
////		
////		Set<String> windowNames = driver.getWindowHandles();
////		for(String windowName:windowNames) {
////			if(windowName.equalsIgnoreCase("Facebook")) {
////				driver.switchTo().window(windowName);
////				//Call Login method
////			}else {
////				driver.switchTo().window(windowName).close();
////			}
////		}
//
//		Collection c = new LinkedList();
//		c.add("Anindya");
//		c.add(1);
//		c.add(1.1);
//		c.add(new Problem3(1, "Anindya"));
//
//		Iterator t = c.iterator();
//		for (Iterator i = c.iterator(); i.hasNext();) {
//			System.out.println(i.next());
//		}
//		
//		while(t.hasNext()) {
//			System.out.println(t.next());
//		}
		
		
		B b = new B();
				
		
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		B b1 = new B();
		B b2 = new C();
		C c1 = new C();
		
		a1.classMethod();
		a2.classMethod();
		a3.classMethod();
		b1.classMethod();
		b2.classMethod();
		c1.classMethod();
		
//		
//		Problem3 p3 = new Problem3(1, "Anindya");
//		System.out.println(p3.methodOverloading());
//		System.out.println(p3.methodOverloading(2, 2));
//		System.out.println(p3.methodOverloading("New ", "String"));
//		p3.methodOverloading(2);
//		
		
	}
	
	public int methodOverloading() {
		return 1;
	}
	
	public int methodOverloading(int a, int b) {
		return a+b;
	}
	
	public String methodOverloading(String a, String b) {
		return a+b;
	}
	
	public void methodOverloading(int a) {
		System.out.println(a);
	}
	
	

}

class A{
	protected void classMethod() {
		System.out.println("Class a method called");
	}
}
class B extends A{
	public void classMethod() {
		System.out.println("class b method called");
	}
}

class C extends B{
	public void classMethod() {
		System.out.println("Class c method called");
	}
}