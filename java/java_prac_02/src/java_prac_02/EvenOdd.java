package java_prac_02;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner input = new Scanner(System.in);
		/// Scanner로 인한 에러 발생시 Scanner를 import해주면 해결
		/// 잘모르겠으면 import java.utill.* 입력하면 웬만한건 해결가능
		System.out.print("정수를 입력하시오: ");
		number = input.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("입력된 정수는 짝수 입니다!!");
		}
		else {
			System.out.println("입력된 정수는 홀수 입니다!!");
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}

}
