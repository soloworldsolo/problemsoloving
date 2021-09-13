package com.solo.projectfang.competetiveprogramming.backtracking;


public class TowerOfHanoi {

  public   void towerOfHanoi(int n, String src, String dest, String helper){
        if(n==0){
            return;
        }

        towerOfHanoi(n-1,src,helper,dest);
      System.out.println("Move  disk from" +src +"to" +dest);

        towerOfHanoi(n-1,helper,dest,src);
    }
}
