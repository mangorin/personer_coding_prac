package java_prac_02;

import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		Scanner input = new Scanner(System.in); 
		/// Error : input cannot be resolved �߸� ����
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ� [1-12]: ");
			month = input.nextInt();
		} while (month < 1 || month > 12);
		System.out.println("����ڰ� �Է��� ���� " + month);
	}
}
