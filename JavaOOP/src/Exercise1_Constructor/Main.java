/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise1_Constructor;

public class Main {
	public static void main(String[] args) {
		Date n1 = new Date(1,2,2020);
		HangSx h1 = new HangSx("ABC", "CHINA");
		Film f1 = new Film("Bo Tre", 2021, h1, 2000, n1);
		
		Date n2 = new Date(5,2,2021);
		HangSx h2 = new HangSx("XYZ", "VIETNAM");
		Film f2 = new Film("Bo Gia", 2021, h2, 2000, n2);
		
		System.out.println("film 1: " + f1.toString());
		System.out.println("film 2: " + f2.toString());
		System.out.println("Check Gia Ve: " + f1.ktraGiaVe(f2));
	}
}
