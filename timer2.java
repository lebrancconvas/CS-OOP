package Timer;

public class timer2 {
	public static void main(String[] args) {
		timeTran(3720);
		timeTran(728);
		timeTran(72,78);
		timeTran(3,72,78);
		timeTran(2,80,200);
	}
	
	public static int hour(int s) {
		return s / 3600;
	}
	
	public static int minute(int s) {
		return s%3600 / 60;
	}
	
	public static int second(int s) {
		return s % 60;
	}
	
	public static void timeTran(int s) {
		System.out.println(hour(s) + ":" + minute(s) + ":" + second(s));
	}
	
	public static void timeTran(int m , int s) {
		s = m*60 + s;
		timeTran(s);
	}
	
	public static void timeTran(int h, int m, int s) {
		s = h*3600 + m*60 + s;
		timeTran(s);
	}
}
