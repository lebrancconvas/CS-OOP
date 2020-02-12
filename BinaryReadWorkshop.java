import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class ReadBin {
	public static void main(String[] args) throws IOException {
		String name, tel, address;
		int zipcode;
		DataInputStream fileIn = new DataInputStream(new FileInputStream("friend.dat"));
		try {
			while(true) {
				name = fileIn.readUTF();
				tel = fileIn.readUTF();
				address = fileIn.readUTF();
				zipcode = fileIn.readInt();	
				System.out.println("Dear " + name);
				System.out.println("\tI invite you to my home for celebrate Valentine Day 2020 \non 14 Febuary.");
				System.out.println("");
				System.out.println("Your Penne");
				System.out.println("....................");
				System.out.println("to\n" + name + "\n" + address + "\n" + zipcode + "\n\n");
			}
		}
		catch(EOFException e) {
			System.out.println("End of File");
		}
	}
}
