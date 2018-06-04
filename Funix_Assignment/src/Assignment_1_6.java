import java.util.Scanner;

public class Assignment_1_6 {
	public static void printLength() {
	    String string;
	    int lenght;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.print("Input String: ");
	    string = scanner.nextLine();
	         

	    lenght = string.length();
	         
	    System.out.println("lenght = " + lenght);
	    scanner.close();
	}
	public static void main(String[] args) {
		printLength();
	}
}
