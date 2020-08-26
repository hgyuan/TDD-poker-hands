package com.example;

import java.util.Arrays;

import static com.example.Constant.*;

public class PokerHand {

  CardTypeDetector cardTypeDetector = new CardTypeDetector();
  SameKindCardComparator sameKindCardComparator = new SameKindCardComparator();

  public PokerHand() {
  }

  public String play(String[] black, String[] white) {

    CardType blackCardType = cardTypeDetector.detect(black);
    CardType whiteCardType = cardTypeDetector.detect(white);

    if (blackCardType.getTypeNumber() > whiteCardType.getTypeNumber()) {
      return BLACK_WINS;
    } else if (blackCardType.getTypeNumber() < whiteCardType.getTypeNumber()) {
      return WHITE_WINS;
    }

    int[] blackNumbers = CardConverter.convertCardValueToNumber(black);
    int[] whiteNumbers = CardConverter.convertCardValueToNumber(white);

    Arrays.sort(blackNumbers);
    Arrays.sort(whiteNumbers);

    return sameKindCardComparator.compare(blackCardType, blackNumbers, whiteNumbers);
  }
}
