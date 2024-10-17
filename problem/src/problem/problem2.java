package problem;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a = sc.nextInt();
		int num=1;
		for(int i=1;i<=a;i++) {
			if(i==1) {
				System.out.print(i);
			}
			else {
				System.out.print(", " + num);
			}
			num+=2;
		}

	}

}
