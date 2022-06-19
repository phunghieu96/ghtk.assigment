package com.ghtk.vonglap;

public class DoWhileLoop {

    public void doWhileLoop() {
        int i = 2;
        int sum = 0;
      //1 kp snt nen bd tu 2
        do {
            if (check(i)) {
                sum += i;
            }
            i++;
        } while (i <= 10000);
        System.out.println("Do-While");
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
