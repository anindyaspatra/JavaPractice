package concepts;

public class Withdrawal {
	
	//static int x = 10/0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long amount = 10000;
		long balance = 5000;
//		try {
//			if (amount > balance) {
//
//				throw new InsuffcientFundsException("Insufficient Balance");
//			}
//		} catch (InsuffcientFundsException e) {
//			System.out.println(e.getMessage());
//		}
//		 
//		Object o = new Object();
//		String s = (String)o;
		
		Thread t = new Thread();
		//t.setPriority(100);
		
		t.start();
		t.start();
	}
	
//	static {
//		String s = null;System.out.println(s.length());
//	}

}
