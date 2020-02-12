import java.io.*;
import java.util.Scanner;
public class WriteBin {
	public static void main(String[] args) throws IOException {
		String filename = "";
		String name, tel, address;
		int zipcode;
		Scanner Scan = new Scanner(System.in);
		DataOutputStream fileOut = new DataOutputStream(new FileOutputStream("friend.dat"));
		for(int i = 1; i <= 10; i++) {
			System.out.print("Name : ");
			name = Scan.nextLine();
			System.out.print("Tel : ");
			tel = Scan.nextLine();
			System.out.print("Address : ");
			address = Scan.nextLine();
			System.out.print("Zipcode : ");
			zipcode = Scan.nextInt();
			Scan.nextLine();
			fileOut.writeUTF(name);
			fileOut.writeUTF(tel);
			fileOut.writeUTF(address);
			fileOut.writeInt(zipcode);
		}
		fileOut.close();
	}
}
