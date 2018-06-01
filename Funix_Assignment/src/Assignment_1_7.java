import java.util.Scanner;

public class Assignment_1_7 {
	private static Exception illegalinputexception;
	private static Exception illegalinputexception2;
	private static Scanner scanner;

	public static void main(String[] args) {
	    String string_1 = null, string_2=null;
	    scanner = new Scanner(System.in);
	    boolean checkInput = true; 
	    boolean checkInput2 = true;
	    do {
	         try {
	        	 System.out.print("Input String 1: ");
	 	   	     string_1 = scanner.nextLine();
	             if(string_1.length() != 5) {
	            	 illegalinputexception = null;
					throw illegalinputexception;
	             }
	 	   	     
	         } catch (Exception illegalinputexception) {
	             checkInput = false;
	         }
	         
	     } while (!checkInput);
	    
	    do {
	         try {
	        	 System.out.print("Input String 2: ");
	 	   	     string_2 = scanner.nextLine();
	             if(string_2.length() != 5) {
	            	 illegalinputexception2 = null;
					throw illegalinputexception2;
	             }
	 	   	     
	         } catch (Exception illegalinputexception) {
	             checkInput2 = false;
	         }
	         
	     } while (!checkInput2);

	    if(string_1.equals(string_2)){ 
	    	System.out.println("They are equal!");
	    }
	    else {
	    	if(string_1.length() == string_2.length()) {
	    		for (int i = 0; i<5; i++) {
	    			if (string_1.charAt(i) != string_2.charAt(i)) {
	    				System.out.print("They are different at: " + (i+1) + "\t");
	    			}
	    		}
	    	}
	    	else System.out.println("Their lengths are not equals");
	    }
	}
}
