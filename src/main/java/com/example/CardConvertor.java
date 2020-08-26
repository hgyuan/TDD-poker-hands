package com.example;

import java.util.HashMap;
import java.util.Map;

public class CardConvertor {

  private static Map<Character, Integer> map;

  static {
    initMap();
  }

  public CardConvertor(){

  }

  private static void initMap() {
    map = new HashMap<Character, Integer>();
    map.put('2', 2);
    map.put('3', 3);
    map.put('4', 4);
    map.put('5', 5);
    map.put('6', 6);
    map.put('7', 7);
    map.put('8', 8);
    map.put('9', 9);
    map.put('T', 10);
    map.put('J', 11);
    map.put('Q', 12);
    map.put('K', 13);
    map.put('A', 14);
  }

  public static int[] convertCardValueToNumber(String[] card) {
    int[] numbers = new int[5];
    for (int i = 0; i < 5; i++) {
      char cardValue = card[i].charAt(0);
      numbers[i] = map.get(cardValue);
    }
    return numbers;
  }

  public static Character[] convertCardSuitToChar(String[] card) {
    Character[] suits = new Character[5];
    for (int i = 0; i < 5; i++) {
      suits[i] = card[i].charAt(1);
    }
    return suits;
  }
}

