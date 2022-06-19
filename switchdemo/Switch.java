package com.ghtk.switchdemo;

import java.util.Scanner;

public class Switch {

	public void dayOfMonth(int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 ngay");
			break;
		case 2:
			System.out.println("28 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 ngay");
			break;
		}
	}

	public static void main(String[] args) {
		Switch s = new Switch();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("vui long nhap thang:");
		int month = sc.nextInt();
		System.out.print("thang " + month + " co: ");
		s.dayOfMonth(month);
	}
}