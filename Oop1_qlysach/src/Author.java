
public class Author {
	private String nameAuthor;
	private Date ngaySinh;
//Hàm tạo constructor
	public Author(String nameAuthor, Date ngaySinh) {
		this.nameAuthor = nameAuthor;
		this.ngaySinh = ngaySinh;
	}
// Hàm get và set
	public String getNameAuthor() {
		return this.nameAuthor;
	}
	public void setNameAuthor(String name) {
		this.nameAuthor = name;
	}
	
	public Date getNgaySinh() {
		return this.ngaySinh;
	}
	public void setNgaySinh(Date date) {
		this.ngaySinh = date;
	}
// Hàm toString()
	public String toString() {
		return this.nameAuthor + "-" + this.ngaySinh;
	}
}
