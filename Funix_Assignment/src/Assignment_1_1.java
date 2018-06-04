import java.util.Scanner;

public class Assignment_1_1 {

	public static void findMinMax() {
		Scanner sc = new Scanner( System.in );
		System.out.println("Finding MIN & MAX");
		System.out.print("A = ");
		int a = Integer.parseInt(sc.next());
		System.out.print("B = ");
		int b = Integer.parseInt(sc.next());
		System.out.print("C = ");
		int c = Integer.parseInt(sc.next());
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
		sc.close();
	}
	public static void main( String[]args) {
		findMinMax();
	}
}