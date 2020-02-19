//import java.util.*;
public class toBinary {
	public static void main(String[] args) {
		decimalToBase(23, 2);
		decimalToBase(5, 2);
	}
	
	public static void decimalToBase(int num, int base) {
//		int b = 0;
		String bin = "";
		while(num > 0) {
			int modu = num % base;
			num /= base;
			String modustr = Integer.toString(modu);
			bin += modustr;
		}
		
		String realconvert = "";
        
        
        for(int i = bin.length() - 1; i >= 0; i--)
        {
            realconvert = realconvert + bin.charAt(i);
        }
		
//		bin.replaceFirst("(.)(.*)(.)", "$3$2$1");
	
		System.out.println(realconvert);
	}
}
	