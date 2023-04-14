
public class main {
	public static void main(String[] args) {
		Date ngay1 = new Date(26,9,2003);
		Author tg1 = new Author("Hao", ngay1);
		Book s1 = new Book("sach1", 1000, 2010, tg1);
		
		Date ngay2 = new Date(15,9,2004);
		Author tg2 = new Author("Hung", ngay2);
		Book s2 = new Book("sach2", 2000, 2011, tg2);
		s1.outPut();
		s2.outPut();
		
		System.out.println("Check nam sx: " + s1.checkNamSx(s2));
		System.out.println("Gia can tra sau khi giam s1 10%: " + s1.giaSauKhiGiam(10));
		System.out.println("Gia can tra sau khi giam s2 10%: " + s2.giaSauKhiGiam(10));
	}
	
}
