package com.solo.projectfang.competetiveprogramming;

/**
 *
 */
public class LucasTheorem {

    public int nCrModulus(int n, int r, int p) {
        if (r == 0) {
            return 1;
        }

        int ni = n % p;
        int ri = r % p;

        int np = n / p;
        int rp = r / p;

        return (nCrModulus(np, rp, p) * ncrDP(ni, ri, p)) % p;
    }

    private int ncrDP(int ni, int ri, int p) {
        int[] pascalTriangle = new int[ri + 1];
        pascalTriangle[0] = 1;

        for (int i = 1; i <= ni; i++) {
            for (int j = Math.min(i, ri); j > 0; j--) {
                pascalTriangle[j] = (pascalTriangle[j] + pascalTriangle[j - 1]) % p;
            }
        }
        return pascalTriangle[ri];
    }
}
