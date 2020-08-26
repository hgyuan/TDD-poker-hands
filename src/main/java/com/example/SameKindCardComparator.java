package com.example;

import static com.example.Constant.*;

public class SameKindCardComparator {

  public String compare(CardType type, int[] blackCardValue, int[] whiteCardValue) {
    switch (type) {
      case FOUR_OF_A_KIND:
      case FULL_HOUSE:
      case THREE_OF_A_KIND:
        return fourOfAKindOrFullHouseOrThreeOfAKindCompare(blackCardValue, whiteCardValue);
      case TWO_PAIRS:
        return twoPairsCompare(blackCardValue, whiteCardValue);
      case PAIR:
        return pairsCompare(blackCardValue, whiteCardValue);
      default:
        return defaultCompare(blackCardValue, whiteCardValue);

    }
  }

  private String fourOfAKindOrFullHouseOrThreeOfAKindCompare(int[] blackCardValue, int[] whiteCardValue) {
    if (blackCardValue[2] > whiteCardValue[2]) {
      return BLACK_WINS;
    }
    return WHITE_WINS;
  }

  private String twoPairsCompare(int[] blackCardValue, int[] whiteCardValue) {
    if (blackCardValue[3] > whiteCardValue[3]) {
      return BLACK_WINS;
    } else if (blackCardValue[3] < whiteCardValue[3]) {
      return WHITE_WINS;
    }
    if (blackCardValue[1] > whiteCardValue[1]) {
      return BLACK_WINS;
    } else if (blackCardValue[1] < whiteCardValue[1]) {
      return WHITE_WINS;
    }
    return defaultCompare(blackCardValue, whiteCardValue);
  }

  private String pairsCompare(int[] blackCardValue, int[] whiteCardValue) {
    if (getPairNumber(blackCardValue) > getPairNumber(whiteCardValue)) {
      return BLACK_WINS;
    } else if (getPairNumber(blackCardValue) < getPairNumber(whiteCardValue)) {
      return WHITE_WINS;
    }
    return TIE;
  }

  private int getPairNumber(int[] cardValue) {
    int pairNumber = 0;
    for (int i = 1; i < 5; i++) {
      if (cardValue[i] == cardValue[i - 1]) {
        pairNumber = cardValue[i];
      }
    }
    return pairNumber;
  }

  private String defaultCompare(int[] blackCardValue, int[] whiteCardValue) {
    for (int i = 4; i >= 0; i--) {
      if (blackCardValue[i] > whiteCardValue[i]) {
        return BLACK_WINS;
      } else if (blackCardValue[i] < whiteCardValue[i]) {
        return WHITE_WINS;
      }
    }
    return TIE;
  }

}
