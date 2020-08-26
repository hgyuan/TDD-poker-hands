package com.example;

import java.util.Arrays;

public class PokerHand {

  DetectCardType detectCardType = new DetectCardType();

  public PokerHand() {
  }

  public String play(String[] black, String[] white) {

    CardType blackCardType = detectCardType.detect(black);
    CardType whiteCardType = detectCardType.detect(white);

    if (blackCardType.getTypeNumber() > whiteCardType.getTypeNumber()) {
      return "black wins";
    } else if (blackCardType.getTypeNumber() < whiteCardType.getTypeNumber()) {
      return "white wins";
    }

    int[] blackNumbers = CardConvertor.convertCardValueToNumber(black);
    int[] whiteNumbers = CardConvertor.convertCardValueToNumber(white);

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
}
