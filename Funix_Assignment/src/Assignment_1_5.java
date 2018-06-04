import java.util.Scanner;

public class Assignment_1_5 {
	public static void checkSymetricArray() {
		  int n, kt = 1;
		  Scanner scanner = new Scanner(System.in);
		  do {
		     System.out.print("Input n:  ");
		      n = scanner.nextInt();
		   } while (n <= 0);
		         
		   String A[] = new String[n];
		         
		    System.out.println("Type array: ");
		    for (int i = 0; i < n; i++) {
		        System.out.print("A[" + i + "] = ");
		        A[i] = scanner.next();
		    }
		    
		    for (int i = 0; i < n / 2; i++) {
		        if ((A[i]).equals(A[n-i- 1])==false) {
		            kt = 0;
		            break;
		        }
		    }
		    if (kt == 0) {
		        System.out.println("This is not symmetric arrays");
		    } else {
		        System.out.println("This is symmetric arrays");
		    }
		scanner.close();
	}
	public static void main(String[] args) {
		checkSymetricArray();
	}	
}
