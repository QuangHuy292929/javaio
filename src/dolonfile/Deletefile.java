package dolonfile;

import java.io.File;
import java.util.Scanner;

public class Deletefile {
	public Deletefile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập đường dẫn của file muốn xóa: ");
		String duongdan = sc.nextLine();
		File file = new File(duongdan);
		if(file.exists()==true) {
			System.out.println("Bạn có chắc muốn xóa file:"+file.getName()+" không");
			System.out.println("1.Có");
			System.out.println("2.Không");
			System.out.println("Nhập lựa chọn của bạn:");
			int lc = sc.nextInt();
			if(lc==1) {
				file.delete();
				System.out.println("Đã xóa thành công");
			} else if(lc==2) System.out.println("Đã hủy xóa");
		} else {
			System.out.println("File không tồn tại");
		}
	}
	public static void main(String[] args) {
		new Deletefile();
	}
}
