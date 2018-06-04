import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Assignment_1_4 {
	public static void reverseArray() {
		int node;
		LinkedList<Integer> linkedList = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		
		for (int i =0; i<10;i++) {
			System.out.printf("A[%d] =",i+1);
			 node = sc.nextInt();
		      linkedList.add(node);
		}
		System.out.println("First array list ");
		
		for(int i = 0; i <10 ; i++) {
			System.out.print(linkedList.get(i) + "\t");
		}
	    System.out.println("\nAfter reverse");
	    Collections.reverse(linkedList);
	    
	    for (int i = 0; i < 10; i++) {
	        System.out.print(linkedList.get(i) + "\t");
	    }
	    sc.close();
	}
	public static void main(String [] args) {
		reverseArray();
	}
}
