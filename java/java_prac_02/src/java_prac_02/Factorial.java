package java_prac_02;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = 1;
		int n;
		System.out.printf("������ �Է��Ͻÿ�:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		System.out.printf("%d!�� %d�Դϴ�.\n", n, fact);

	}

}
