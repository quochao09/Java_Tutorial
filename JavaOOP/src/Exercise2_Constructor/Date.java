/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2_Constructor;


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
// Hàm get và set
	public int getDay() {
		return this.day;
	}
	public void setDay(int a) {
		if(a > 0 && a < 31) {
			this.day = a;
		}else {
			this.day = 1;
		};
	}
	
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int b) {
		if(b > 0 && b < 13) {
			this.month = b;
		}else {
			this.month = 1;
		}
	}
	
	public int getYear() {
		return this.year;
	}
	public void setYear(int c) {
		if(c > 0) {
			this.year = c;
		} else {
			this.year = 1;
		}
	}
// Hàm toString
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
}
