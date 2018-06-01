import java.util.Scanner;

public class Assignment_1_1 {

	private static float a,b,c;
	private static Scanner sc;


	public static void main( String[]args) {

		sc = new Scanner( System.in );
		System.out.println("Finding MIN & MAX");
		System.out.print("A = ");
		a = Integer.parseInt(sc.next());
		System.out.print("B = ");
		b = Integer.parseInt(sc.next());
		System.out.print("C = ");
		c = Integer.parseInt(sc.next());
		float max = a;
		float min = a;
		if (max < b) max = b;
		if (max < c) max = c;
		
		if (b < min) min = b;
		if (c < min) min = c;
		System.out.print("Max = ");
		System.out.println(max);
		System.out.print("Min = ");
		System.out.println(min);
	}
}