package com.solo.leetcode.greedyalgorithm;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int numofFlowers = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && adjacent(i, flowerbed)) {
                numofFlowers++;
            }
        }
        return numofFlowers >= 0;

    }

    private boolean adjacent(int i, int[] flowerbed) {
        boolean previous = false;
        boolean next = false;
        previous = (i == 0) ? true : flowerbed[i - 1] == 0;
        next = (i == flowerbed.length - 1) ? true : flowerbed[i + 1] == 0;
        return previous && next;

    }
}
