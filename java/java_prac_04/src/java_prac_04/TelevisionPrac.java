package java_prac_04;

public class TelevisionPrac {

	public static void main(String[] args) {

		Television myTv = new Television();
		// src�� Television�̶�� java Class�� �����߱⶧���� ���� ���� ���
		myTv.channel = 100;
		myTv.volume = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel(); // myTv.channel�� ch�� �������
		System.out.println("���� ä���� " + ch + "�Դϴ�.");

	}

}
