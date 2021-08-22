package com.java.coreconcepts;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass abs = new AbstractClass() {
			
			@Override
			public void loan() {
				// TODO Auto-generated method stub
				System.out.println("Main method implementation of Loan");
			}
//			
//			@Override
//			public void interest() {
//				// TODO Auto-generated method stub
//				System.out.println("Main method implementation of Interest");
//				
//			}
		};
		HDFCBank hdfc = new HDFCBank();
		ICICIBank icici = new ICICIBank();
		
		hdfc.nao();
		icici.nao();
		hdfc.interest();
		icici.interest();
		abs.loan();
		abs.nao();
		abs.interest();
		
	}

}
