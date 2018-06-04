import java.util.Scanner;

public class Assignment_1_8 {

	public static void unlimitTyping () {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		boolean flag = true;
			 do {
				 System.out.print("Input i = ");
				 int i = sc.nextInt();
				 System.out.println();
				 sum = sum + i;
				 if (i == 0) break;
			 }while (flag == true);
		
		System.out.println("Sum = " +sum);
		
		sc.close();
	}
	public static void main(String[] args) {
		unlimitTyping();
	}
}
