package com.example;

import java.util.Arrays;

public class CardTypeDetector {

  public CardType detect(String[] card) {
    if (isStraightFlush(card)) {
      return CardType.STRAIGHT_FLUSH;
    } else if (isFourOfAKind(card)) {
      return CardType.FOUR_OF_A_KIND;
    } else if (isFullHouse(card)) {
      return CardType.FULL_HOUSE;
    } else if (isFlush(card)) {
      return CardType.FLUSH;
    } else if (isStraight(card)){
      return CardType.STRAIGHT;
    }
    return CardType.HIGH_CARD;
  }

  private boolean isStraightFlush(String[] card) {
    if (!isStraight(card)){
      return false;
    }
    Character[] cardSuit = CardConverter.convertCardSuitToChar(card);
    return Arrays.stream(cardSuit).distinct().count() == 1;
  }

  private boolean isFourOfAKind(String[] card) {
    int[] cardValues = CardConverter.convertCardValueToNumber(card);
    Arrays.sort(cardValues);
    if(Arrays.stream(cardValues).distinct().count() != 2) {
      return false;
    }
    return cardValues[0] != cardValues[1] || cardValues[3] != cardValues[4];

  }

  private boolean isFullHouse(String[] card) {
    int[] cardValues = CardConverter.convertCardValueToNumber(card);
    Arrays.sort(cardValues);
    if(Arrays.stream(cardValues).distinct().count() != 2) {
      return false;
    }
    return cardValues[0] == cardValues[1] && cardValues[3] == cardValues[4];
  }

  private boolean isFlush(String[] card) {
    Character[] cardSuit = CardConverter.convertCardSuitToChar(card);
    return Arrays.stream(cardSuit).distinct().count() == 1;
  }

  private boolean isStraight(String[] card){
    int[] cardValues = CardConverter.convertCardValueToNumber(card);
    Arrays.sort(cardValues);
    for (int i = 1; i < cardValues.length; i++) {
      if (cardValues[i] - 1 != cardValues[i - 1]) {
        return false;
      }
    }
    return true;
  }
}
