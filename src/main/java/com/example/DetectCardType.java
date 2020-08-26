package com.example;

import java.util.Arrays;

public class DetectCardType {

  public CardType detect(String[] card) {
    if (isStraightFlush(card)) {
      return CardType.STRAIGHT_FLUSH;
    }
    return CardType.HIGHT_CARD;
  }

  private boolean isStraightFlush(String[] card) {
    int[] cardValues = CardConvertor.convertCardValueToNumber(card);
    Arrays.sort(cardValues);
    for (int i = 1; i < cardValues.length; i++) {
      if (cardValues[i] - 1 != cardValues[i - 1]) {
        return false;
      }
    }
    Character[] cardSuit = CardConvertor.convertCardSuitToChar(card);
    return Arrays.stream(cardSuit).distinct().count() == 1;
  }
}
