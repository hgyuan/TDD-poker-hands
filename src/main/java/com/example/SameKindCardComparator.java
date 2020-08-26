package com.example;
import static com.example.Constant.*;

public class SameKindCardComparator {

  public String compare(CardType type, int[] blackCardValue, int[] whiteCardValue){
    switch (type){
      case FOUR_OF_A_KIND:
      case FULL_HOUSE:
      case THREE_OF_A_KIND:
        return fourOfAKindOrFullHouseOrThreeOfAKindCompare(blackCardValue, whiteCardValue);
      default:
        return defaultCompare(blackCardValue, whiteCardValue);

    }
  }

  private String fourOfAKindOrFullHouseOrThreeOfAKindCompare(int[] blackCardValue, int[] whiteCardValue){
    if (blackCardValue[2] > whiteCardValue[2]){
      return BLACK_WINS;
    }
    return WHITE_WINS;
  }

  private String defaultCompare(int[] blackCardValue, int[] whiteCardValue){
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
