package Timer;

public class timer {
	public static void main(String[] args) {
		timeTran(3720);
		timeTran(728);
		timeTran(72,78);
		timeTran(3,72,78);
	}
	
	public static void transform(int s) {
		int hr = s / 3600;
		int min = s%3600/60;
		int sec = s % 60;
		System.out.println(hr + ":" + min + ":" + sec);
	}
	
	public static void timeTran(int s) {
		transform(s);
	}
	
	//overload คือ ชื่อเมทอดเดียวกันแต่มีพารามิเตอร์ไม่เหมือนกัน
	public static void timeTran(int m, int s) {
		s = (m * 60) + s;
		transform(s);
	}
	
	public static void timeTran(int h, int m, int s) {
		s = h*3600 + m*60 + s;
		transform(s);
	}
}
