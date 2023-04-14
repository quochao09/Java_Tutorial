package Interface;
// Là bản thiết của 1 lớp, ý muốn làm tương tự giống đa kế thừa(Java không có đa kế thừa)
// Kế thừa theo dạng viết lại
// Chỉ có phương thức trừu tượng và các hằng số(public, static,final)
// Tất cả phương thức ở dạng public
// Tương tự giống Abstract, nó không thể khởi tạo đối tượng cụ thể
public class main {
	public static void main(String[] args) {
		System.out.println("Test cau a:");
		MayTinhCasioFx580 mt1 = new MayTinhCasioFx580();
		System.out.println("1+1 = " + mt1.cong(1, 1));
		System.out.println("1/0 = " + mt1.chia(1, 0));
		MayTinhVinacal500 mt2 = new MayTinhVinacal500();
		
		System.out.println("Test cau b:");
		double[] arr1 = new double[] {1,5,3,2,7,8};
		//int n = arr1.length;
		double[] arr2 = new double[] {3,8,5,9,2,6};
		SapXepChen chen = new SapXepChen();
		SapXepChon chon = new SapXepChon();
		System.out.print("sx chen tang: " );
		chen.sapXepTang(arr1);
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " -> ");
		}
		System.out.println("*");
		chon.sapXepGiam(arr2);
		System.out.print("Sx chon giam: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " -> ");
		}
		System.out.println("*");
		System.out.println("Test cau c: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println("PMMT cong: 1+5 = " + pmmt.cong(1, 5));
		System.out.println("PMMT sx tang arr1: ");
		pmmt.sapXepTang(arr1);
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " -> ");
		}
	}
}
