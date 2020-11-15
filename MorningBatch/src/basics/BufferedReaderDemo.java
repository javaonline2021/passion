package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter you A Value :");
		String str = br.readLine();

		int a = Integer.parseInt(str);

		System.out.println("Enter you B Value :");
		String str1 = br.readLine();

		int b = Integer.parseInt(str1);

		int res = a + b;
		System.out.println("Addition :" + res);
		
		

	}

}
