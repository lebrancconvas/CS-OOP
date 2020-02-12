import java.io.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Swing {
	public static void main(String[] args) throws IOException {
		String filename = "";
		String id, name, dept, sname;
		double mid, fin;
		boolean notfound = true;
		filename = JOptionPane.showInputDialog("Enter Filename");
		DataInputStream fileIn = new DataInputStream(new FileInputStream(filename));
		sname = JOptionPane.showInputDialog("Enter Search Name");
		try {
			while(true) {
				id = fileIn.readUTF();
				dept = fileIn.readUTF();
				name = fileIn.readUTF();
				mid = fileIn.readDouble();
				fin = fileIn.readDouble();
				if(name.equals(sname)) {
					System.out.println(name + "\t" + mid + "\t" + fin);
					notfound = false;
				}
			}
		}
		catch(EOFException e) {
			if(notfound) {
				System.out.println("Not Found " + sname);
			}
		}
	}
}
