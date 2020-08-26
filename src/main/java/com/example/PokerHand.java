package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PokerHand {

  private Map<Character, Integer> map;

  public PokerHand() {
    initMap();
  }

  public String play(String[] black, String[] white) {
    int[] blackNumbers = convertCardValueToNumber(black);
    int[] whiteNumbers = convertCardValueToNumber(white);

    Arrays.sort(blackNumbers);
    Arrays.sort(whiteNumbers);

    for (int i = 4; i >= 0; i--) {
      if (blackNumbers[i] > whiteNumbers[i]) {
        return "black wins";
      } else if (blackNumbers[i] < whiteNumbers[i]) {
        return "white wins";
      }
    }
    return "tie";
  }

  private int[] convertCardValueToNumber(String[] card) {
    int[] numbers = new int[5];
    for (int i = 0; i < 5; i++) {
      char cardValue = card[i].charAt(0);
      numbers[i] = map.get(cardValue);
    }
    return numbers;
  }

  private void initMap() {
    map = new HashMap<Character, Integer>();
    map.put('1', 1);
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
}
