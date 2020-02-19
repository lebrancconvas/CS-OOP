//import java.util.*;
public class toBinary {
	public static void main(String[] args) {
		baseToBinary(23);
		baseToBinary(1000);
		baseToBinary(8);
	}
	
	public static void baseToBinary(int num) {
		int b = 0;
		while(num > 0) {
			b = (10 * b) + (num % 2);
			num /= 2;
		}
	
		System.out.println(b);
	}
}
	