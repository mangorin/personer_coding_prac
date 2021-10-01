package java_prac_04;

public class TelevisionPrac {

	public static void main(String[] args) {

		Television myTv = new Television();
		// src에 Television이라는 java Class를 생성했기때문에 에러 없이 기능
		myTv.channel = 100;
		myTv.volume = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel(); // myTv.channel을 ch로 가지고옴
		System.out.println("현재 채널은 " + ch + "입니다.");

	}

}
