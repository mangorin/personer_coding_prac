package java_prac_04;

public class Television {
	
	//메소드 반환하기

	int channel; // 채널 번호
	int volume; // 볼륨
	boolean onOff; // 전원 상태
	void print() {
	System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + 
	"입니다.");
	}
	int getChannel() {
	return channel;


	}

}
