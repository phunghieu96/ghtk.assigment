package com.ghtk.vonglap;

public class ForLoop {

    public void forLoop() {
        int sum = 0;
        for (int i = 2; i <= 10000; i++) {
            if (check(i)) {
                sum += i;
            }
        }
        System.out.println("For Lopp");
        System.out.println("Tong cua cac snt tu 1 - 10000 = " + sum);
    }

    public boolean check(int n) {
        double x = Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}