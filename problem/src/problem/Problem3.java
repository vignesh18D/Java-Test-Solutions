package problem;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a= sc.nextInt();
		int num=1;
		if(a==1 || a==2) {
			System.out.print(num);
		}
		else {
			if(a%2==0) {
				a=a-1;
			}
			for (int i = 1; i <= a; i++) {
	            System.out.print(num);
	            num += 2; 
	            if (i < a) {
	                System.out.print(", ");
	            }
	        }

	        System.out.println();
		
		}
	}

}
