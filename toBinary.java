public class toBinary {
	public static void main(String[] args) {
		decimalToBase(23, 2);
		decimalToBase(5, 3);
		decimalToBase(17, 5);
		decimalToBase(233, 16);
		decimalToBase(255, 12);
	}
	
	public static void decimalToBase(int num, int base) {
		String bin = "";
		while(num > 0) {
			int modu = num % base;
			num /= base;
			String modustr = Integer.toString(modu);
			switch(modustr) {
				case "10":
					modustr = "A";
					break;
				case "11":
					modustr = "B";
					break;
				case "12":
					modustr = "C";
					break;
				case "13":
					modustr = "D";
					break;
				case "14":
					modustr = "E";
					break;
				case "15":
					modustr = "F";
					break;
				case "16":
					modustr = "G";
					break;
				default:
					break;
			}
			bin += modustr;
		}
		
		String realconvert = "";
        
        
        for(int i = bin.length() - 1; i >= 0; i--)
        {
            realconvert = realconvert + bin.charAt(i);
        }
	
		System.out.println(realconvert);
	}
}
	