package dolonfile;

import java.io.File;
import java.util.Scanner;

public class Size {
	public Size() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập đường dẫn của file: ");
		String duongdan = sc.nextLine();
		File file = new File(duongdan);
		if(file.exists()==true) {
			System.out.println("Tên file: "+file.length());
			System.out.println("Độ lớn của file: "+file.length()+" byte");
		} else {
			System.out.println("File không tồn tại!");
		}
	}
	public static void main(String[] args) {
		new Size();
	}
	
}
