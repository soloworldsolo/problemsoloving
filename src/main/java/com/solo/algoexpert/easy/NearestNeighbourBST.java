package com.solo.algoexpert.easy;

import java.util.Objects;

public class NearestNeighbourBST {
    public static int findClosestValueInBst(BST tree, int target) {
        Objects.requireNonNull (tree, "input tree was empty");
        BST cureent = tree;
        BST previous = null;

        while(cureent!= null) {
            if(cureent.value< target) {
                if(cureent.right == null)
                    return  cureent.value;

                previous = cureent;
                 cureent = cureent.right;
            }else if(cureent.value > target) {
                if(cureent.left == null)
                    return  cureent.value;

                previous = cureent;
                cureent = cureent.left;
            }else {
                return previous.value;
            }
        }

        return  previous == null?cureent.value : previous.value;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {


        System.out.println ((Math.abs (10-12)) );


    }
}
