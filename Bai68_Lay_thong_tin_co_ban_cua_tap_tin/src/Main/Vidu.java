package Main;

import java.io.File;
import java.util.Scanner;

public class Vidu {
	File tenFile;

	public Vidu(String tenFile) {
		this.tenFile = new File(tenFile);
	}

	public boolean kiemTraThucThi() {
		// Kiểm tra file có thể thực thi
		return this.tenFile.canExecute();
	}

	public boolean kiemTraDoc() {
		// Kiểm tra file có thể đọc
		return this.tenFile.canRead();
	}

	public boolean kiemTraGhi() {
		// Kiểm tra file có thể đọc
		return this.tenFile.canWrite();
	}

	public void inDuongDan() {
		// In đường dẫn
		System.out.println(this.tenFile.getAbsolutePath());
	}

	public void inTen() {
		// In tên file
		System.out.println(this.tenFile.getName());
	}

	public void kiemTraFileLaThuMucHoacTapTin() {
		if (this.tenFile.isDirectory()) {
			System.out.println("Đây là thư mục. ");
		} else if (this.tenFile.isFile()) {
			System.out.println("Đây là file. ");
		}

	}

	public void inRaDanhSachCacFileCon() {
		if (this.tenFile.isDirectory()) {
			System.out.println("Các tập tin con/ thư mục con là:  ");
			File[] mangCon = this.tenFile.listFiles();
			for (File file : mangCon) {
				System.out.println(file.getAbsolutePath());
			}
		} else if (this.tenFile.isFile()) {
			System.out.println("Đây là tập tin không có dữ liệu con bên trong ");
		}

	}

	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.tenFile, 1);
	}

	public void inChiTietCayThuMuc(File f, int bac) {
//		System.out.println("|");
		for (int i = 0; i < bac; i++) {
			System.out.println("\t");
		}
		System.out.print("|_");
		System.out.print(f.getName());
		if (f.canRead() && f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File file : mangCon) {
				inChiTietCayThuMuc(file, bac + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int luachon = 0;
		do {
			System.out.println("Nhập tên file: ");
			String tenFile = scanner.nextLine();
			Vidu vidu = new Vidu(tenFile);

			System.out.println("Menu---------------");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hoặc tệp tập: ");
			System.out.println("7. In ra  file con: ");
			System.out.println("9. In ra cây thư mục: ");
			System.out.println("0. Thoát chương trình: ");
			luachon = scanner.nextInt();
			switch (luachon) {
			case 1:
				System.out.println(vidu.kiemTraThucThi());
				break;
			case 2:
				System.out.println(vidu.kiemTraDoc());
				break;
			case 3:
				System.out.println(vidu.kiemTraGhi());
				break;
			case 4:
				vidu.inDuongDan();
				break;
			case 5:
				vidu.inTen();
				break;
			case 6:
				vidu.kiemTraFileLaThuMucHoacTapTin();
				break;
			case 7:
				vidu.inRaDanhSachCacFileCon();
				break;
			case 8:
				vidu.inCayThuMuc();
				break;

			default:
				break;
			}
			scanner.nextLine();
		} while (luachon != 0);
		scanner.close();
	}

}
