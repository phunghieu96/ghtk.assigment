package com.ghtk.vonglap;

public class WhileLoop {

    public void whileLoop() {
        int sum = 0;
        int i = 2;
        while (i <= 10000) {
            if (check(i)) {
                sum += i;
            }
            i++;
        }
        System.out.println("While Loop");
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