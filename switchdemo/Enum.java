package com.ghtk.switchdemo;

public class Enum {

    enum monthOfYear {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void enumSwitch(monthOfYear month) {
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println("31 ngay");
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                System.out.println("30 ngay");
                break;
            case FEBRUARY:
                System.out.println("28 ngay");
                break;
        }
    }

    public static void main(String[] args) {
        enumSwitch(monthOfYear.OCTOBER);
    }
}
