package com.solo.algoexpert.easy;

import java.util.Objects;

/**
 * implementaion of ceaser cipher asked during altimetrik interview checking the knowledge in modulo
 * operator
 *
 * workl fine with [a-zA-Z0-9]
 */
public class CeaserCipherEncryptor {

  public static String caesarCypherEncryptor(String str, int key) {
    Objects.requireNonNull(str, "input cannot be empty");
    if (key < 0) {
      throw new IllegalArgumentException("key value shoul atleat 1");
    }
    return encrypt(str.toCharArray(), key);
  }

  private static String encrypt(char[] toCharArray, int key) {
    char[] result = new char[toCharArray.length];
    for (int i = 0; i < toCharArray.length; i++) {
      Character currentCharacter = toCharArray[i];
      if (Character.isDigit(currentCharacter)) {
        int numericValue = ((int) currentCharacter + key + 10 - 48) % 10 + 48;
        result[i] = (char) numericValue;
      }
      if (Character.isLetter(currentCharacter)) {
        int numericValue = (((int) currentCharacter + key - 97 + 26) % 26) + 97;
        result[i] = (char) numericValue;
      }

    }
    return new String(result);
  }

  public static void main(String[] args) {
    System.out.println(caesarCypherEncryptor("soloworldz51759", 1));
  }
}
