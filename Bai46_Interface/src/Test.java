
public class Test {
public static void main(String[] args) {
	System.out.println("Test câu a:");
	MayTinhCasio m1 = new MayTinhCasio();
	MayTinhVinaCal vinaCal = new MayTinhVinaCal();

	System.out.println("1+1: "+m1.Cong(1, 1));
	System.out.println("1-1: "+m1.Tru(1, 1));
	System.out.println("1*1: "+m1.Nhan(1, 1));
	System.out.println("5/0: "+m1.Chia(5, 0));

	System.out.println("Test câu b:");
	double[] arr = new double[] {1,10,7,4,3};
	SapXepChen sXepChen = new SapXepChen();
	sXepChen.SapXepGiam(arr);
	System.out.println("Sắp xếp Giảm:");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	sXepChen.SapXepTang(arr);
	System.out.println("\nSắp xếp Tăng:");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}

	System.out.println("Test câu c:");
	PhanMemMayTinh pMayTinh  = new PhanMemMayTinh();
	
	System.out.println("1+1: "+pMayTinh.Cong(1, 1));
	System.out.println("1-1: "+pMayTinh.Tru(1, 1));
	System.out.println("1*1: "+pMayTinh.Nhan(1, 1));
	System.out.println("5/0: "+pMayTinh.Chia(5, 0));




}

}


