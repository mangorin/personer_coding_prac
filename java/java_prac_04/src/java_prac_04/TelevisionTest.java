package java_prac_04;

public class TelevisionTest {
	
	//�޼ҵ�
	int channel; // ä�� ��ȣ
	int volume; // ����
	boolean onOff; // ���� ����

	public static void main(String[] args) {
		
		TelevisionTest tv = new TelevisionTest(); 
		//�޼ҵ� (��, ������) �� ��� Ŭ���� �̸��� �����Ѱ� �ٽ�
		
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		//�޼ҵ� ���Ǹ� �ؾ���
		
		System.out.println("�ڷ������� ä����" + tv.channel + "�̰� ������ "+
				tv.volume + "�Դϴ�.");


	}

}
