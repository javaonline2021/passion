package basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter you A Value :");
		int a = sc.nextInt();


		System.out.println("Enter you B Value :");
		int b = sc.nextInt();
		int res = a + b;
		System.out.println("Addition :" + res);
		

	}

}
