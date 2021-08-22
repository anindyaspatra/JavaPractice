package concepts;



public interface Vehicle {
	public void Car();
	public default void print(String text) {
        System.out.println(text);
    }

    public static void println(String text){
    	 System.out.println(text);
    }

}
