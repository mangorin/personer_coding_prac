package java_prac_04;

public class TelevisionTest {
	
	//메소드
	int channel; // 채널 번호
	int volume; // 볼륨
	boolean onOff; // 전원 상태

	public static void main(String[] args) {
		
		TelevisionTest tv = new TelevisionTest(); 
		//메소드 (즉, 생성자) 의 경우 클래스 이름과 동일한게 핵심
		
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		//메소드 정의를 해야함
		
		System.out.println("텔레비전의 채널은" + tv.channel + "이고 볼륨은 "+
				tv.volume + "입니다.");


	}

}
