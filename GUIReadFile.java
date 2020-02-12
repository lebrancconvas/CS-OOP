import java.io.*;
import java.util.Scanner;
public class FileWriteAdd {
	public static void main(String[] args) throws IOException {
		String filename = "";
		String id, dept, name;
		double mid, fin;
		Scanner sc = new Scanner(System.in);
		DataOutputStream fileOut = new DataOutputStream(new FileOutputStream("binary.out"));
		for(int i = 1; i <= 3; i++) {
			System.out.println("Student No : "); 
			System.out.print("id : "); id = sc.nextLine();
			System.out.print("dept : "); dept = sc.nextLine();
			System.out.print("name : "); name = sc.nextLine();
			System.out.print("mid : "); mid = sc.nextDouble();
			System.out.print("final : "); fin = sc.nextDouble();
		}
		fileOut.close();
	}
}
