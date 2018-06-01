import java.util.Scanner;

public class Assignment_1_2 {
 private static int a,b,c;
 private static Scanner sc;

public static void main(String[] args ) {

	sc = new Scanner( System.in );
	System.out.println("Finding MIN & MAX");
	System.out.print("A = ");
	a = Integer.parseInt(sc.next());
	System.out.print("B = ");
	b = Integer.parseInt(sc.next());
	System.out.print("C = ");
	c = Integer.parseInt(sc.next());
	/*   */
	System.out.println("Finding triangle type");
	if( a==b && b==c) System.out.print("This is equilateral triangle");
	else if(a==b || b==c || c==a) System.out.print("This is isosceles triangle");
	else if((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
		System.out.print("This is right-angled triangle");
		if(a==b || b==c || c==a) System.out.print("This is right-angled triangle and isosceles triangle");
	}
	else System.out.print("This is normal triangle");
	
 }
}
