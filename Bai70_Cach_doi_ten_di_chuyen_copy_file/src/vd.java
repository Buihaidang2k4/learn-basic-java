import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class vd {
	private static void copy_All(File f0, File f1) {
		// TODO Auto-generated method stub
		try {
			// Copy bản thân nó
			Files.copy(f0.toPath(), f1.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if (f0.isDirectory()) {
			// Copy các tập tin và thư mục con 
			File[] mangCon = f0.listFiles();
			for (File file : mangCon) {
				File file2 = new File(f1.getAbsoluteFile()+ "/" + file.getName());
				copy_All(file, file2);
			}
		}
		
	}
	
	public static void main(String[] args) {
		File f0 = new File("E:\\Java\\Bai70_Cach_doi_ten_di_chuyen_copy_file\\abc.txt"); 
		File f1 = new File("E:\\Java\\Bai70_Cach_doi_ten_di_chuyen_copy_file\\abc2.txt"); 
		File f2 = new File("E:\\Java\\Bai70_Cach_doi_ten_di_chuyen_copy_file\\abc3_x.txt"); 

		// Sử dụng file để thay đổi tên tập tin hoặc thư mục
		f0.renameTo(f1);
		
		//1. sử dụng file đổi tên
//		try {
//			// Di chuyển đè lên luôn
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//2 Di chuyển file
//		File f2_new = new File("E:\\Java\\Bai70_Cach_doi_ten_di_chuyen_copy_file\\F0\\abc3_xyz.txt"); 
//		try {
//			Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		//3 Copy file
		File f_0 = new File("E:\\Java\\Bai70_Cach_doi_ten_di_chuyen_copy_file\\F0"); 
		File f_0_copy = new File("E:\\Java\\Bai70_Cach_doi_ten_di_chuyen_copy_file\\F0_copy"); 
//		try {
//			Files.move(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		vd.copy_All(f_0,f_0_copy);
		
		
	}

	
}
