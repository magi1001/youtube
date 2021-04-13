package justDoIt;

public class Tutorial16_Main extends Tutorial16 {
	public static void main(String[] args) {
		Tutorial16_Main main = new Tutorial16_Main();
		main.play("조아킴 카루드 - 마이티 러브");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songName) {
		System.out.println(songName + "곡을 재생합니다.");
	}

	@Override
	void pause() {
		System.out.println("곡을 일시정지합니다.");
	}

	@Override
	void stop() {
		System.out.println("곡을 정지합니다.");
	}
}
