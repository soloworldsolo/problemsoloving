package com.solo.sorting;

import java.util.Random;

/**
 * implementaion of quick sort
 * <p>
 * QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the
 * given array around the picked pivot. There are many different versions of quickSort that pick
 * pivot in different ways.
 * <p>
 * Always pick first element as pivot. Always pick last element as pivot (implemented below) Pick a
 * random element as pivot. Pick median as pivot. The key process in quickSort is partition().
 * Target of partitions is, given an array and an element x of array as pivot, put x at its correct
 * position in sorted array and put all smaller elements (smaller than x) before x, and put all
 * greater elements (greater than x) after x. All this should be done in linear time.
 */
public class QuickSort implements Sorting {


  @Override
  public void sort(int[] elements) {

    QuickSortHelper(elements, 0, elements.length - 1);
  }

  private void QuickSortHelper(int[] iterable, int start, int end) {
    if (start < end) {
      int n = reorder(iterable, start, end);
      QuickSortHelper(iterable, start, n);
      QuickSortHelper(iterable, n + 1, end);
    }

  }

  private int reorder(int[] iterable, int start, int end) {
    Random random = new Random();
    int pivot = start + random.nextInt(end - start + 1);
    int pivotVal = iterable[pivot];
    int i = start;
    int j = end;
    while (i < j) {
      if (iterable[i] < pivotVal) {
        i++;
      }

      if (iterable[j] > pivotVal) {
        j--;
      }
      if (iterable[i] > iterable[j]) {
        swap(iterable, i, j);
      }
    }
    if (iterable[i] > iterable[j]) {
      swap(iterable, i, j);
    }
    return j;
  }

  private void swap(int[] iterable, int i, int j) {
    int temp = iterable[j];
    iterable[j] = iterable[i];
    iterable[i] = temp;

  }


}
