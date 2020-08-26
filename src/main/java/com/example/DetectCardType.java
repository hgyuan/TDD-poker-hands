package com.example;

import java.util.Arrays;

public class DetectCardType {

  public CardType detect(String[] card) {
    if (isStraightFlush(card)) {
      return CardType.STRAIGHT_FLUSH;
    } else if (isFourOfAKind(card)) {
      return CardType.FOUR_OF_A_KIND;
    } else if (isFullHouse(card)){
      return CardType.FULL_HOUSE;
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

  private boolean isFourOfAKind(String[] card) {
    int[] cardValues = CardConvertor.convertCardValueToNumber(card);
    return Arrays.stream(cardValues).distinct().count() == 2;
  }

  private boolean isFullHouse(String[] card){
    int[] cardValues = CardConvertor.convertCardValueToNumber(card);
    return Arrays.stream(cardValues).distinct().count() == 3;
  }
}
