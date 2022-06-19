package com.ghtk.tinhsongay;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TinhSoNgay {
	public static void tinhngay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hay nhap ngay thang nam d1 theo format yyyy-mm-dd");
		String day1 = sc.next();
		System.out.println("Hay nhap ngay thang nam d2 theo format yyyy-mm-dd");
		String day2 = sc.next();

		// Dinh dang thoi gian
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		// ding nghia 2 moc thoi gian ban dau
		Date date1 = Date.valueOf(day1);
		Date date2 = Date.valueOf(day2);

		c1.setTime(date1);
		c2.setTime(date2);

		// Cong thuc tinh ngay giua 2 moc thoi gian :
		long noDay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);
		System.out.println("So ngay giua " + simpleDateFormat.format(c1.getTime()) + " va "
				+ simpleDateFormat.format(c1.getTime()) + ": ");
		System.out.println(noDay);
	}

	public static void main(String[] args) {
		tinhngay();
	}

}
