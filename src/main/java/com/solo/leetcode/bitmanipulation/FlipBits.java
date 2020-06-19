package com.solo.leetcode.bitmanipulation;

/**
 * program to flip the bits 5 -> 101 flipping it would be 010
 */
public class FlipBits {

  /**
   * using bit masking to acheve the splitting what we are going to do is Setting the rght most
   * bits
   *
   * 5 -> 101 after setting all the right most bit s
   *
   * it would  be 7->111 we can acheive it right shifting and xor ing it right shifting 5 >> 1 010
   *
   * now XOR ing it with the 5 will give 101 | 010 111
   *
   * @return int
   */
  public int flipBit(int number) {
    int bitmask = number;
    bitmask |= (bitmask >> 1);
    bitmask |= (bitmask >> 2);
    bitmask |= (bitmask >> 4);
    bitmask |= (bitmask >> 8);
    bitmask |= (bitmask >> 16);

    return bitmask ^ number;
  }
}
