import java.util.Scanner;

public class Assignment_1_3 {

	public static void findMaxValue() {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		int max = numbers[0];
		System.out.println("start");
		for (int i =0; i<numbers.length;i++) {
			System.out.printf("A[%d] =",i+1);
			numbers[i]= sc.nextInt();
			if(max < numbers[i]) max = numbers[i];
		}
		System.out.print("Max = ");
		System.out.println(max);
		sc.close();
	}

	public static void main(String [] args) {
		findMaxValue();
	}
}
