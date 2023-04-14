package oop1_qlyFilm;

public class Date {
	private int day;
	private int month;
	private int year;
// Hàm khởi tạo constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
// Hàm get và set dữ liệu
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
// Hàm toString để xuất dữ liệu
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
}
