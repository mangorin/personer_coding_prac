package java_prac_02;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner input = new Scanner(System.in);
		/// Scanner�� ���� ���� �߻��� Scanner�� import���ָ� �ذ�
		/// �߸𸣰����� import java.utill.* �Է��ϸ� �����Ѱ� �ذᰡ��
		System.out.print("������ �Է��Ͻÿ�: ");
		number = input.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("�Էµ� ������ ¦�� �Դϴ�!!");
		}
		else {
			System.out.println("�Էµ� ������ Ȧ�� �Դϴ�!!");
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}

}
