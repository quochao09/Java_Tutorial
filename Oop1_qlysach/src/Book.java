import java.util.Scanner;
public class Book {
	Scanner sc = new Scanner(System.in);
	private String nameBook;
	private double price;
	private int namSx;
	private Author tacGia;
// Hàm constructor
	public Book(String nameBook, double price, int namSx, Author tacGia) {
		this.nameBook = nameBook;
		this.price = price;
		this.namSx = namSx;
		this.tacGia = tacGia;
	}
// Hàm get và set
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getNamSx() {
		return namSx;
	}
	public void setNamSx(int namSx) {
		this.namSx = namSx;
	}

	public Author getTacGia() {
		return tacGia;
	}
	public void setTacGia(Author tacGia) {
		this.tacGia = tacGia;
	}
// Các phương thức của đối tượng
	public void outPut() {	
		System.out.println(this.nameBook + "-" + this.price + "-" + this.namSx + "-" + this.tacGia);
	}
	// Check năm sản xuất
	public boolean checkNamSx(Book temp) {
		return this.namSx == temp.namSx;
	}
	// tinh giá tiền sau khi giảm giá
	public double giaSauKhiGiam(double x) {
		return this.price * (1 - x/100);
	}
}
