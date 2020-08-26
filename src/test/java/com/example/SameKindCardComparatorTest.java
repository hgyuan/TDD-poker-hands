package com.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static com.example.Constant.*;

public class SameKindCardComparatorTest {

  @Test
  public void should_return_black_wins_when_compare_given_card_type_full_house_and_black_card_values_3_3_3_4_4_and_white_card_values_2_2_2_5_5() {
    //given
    int[] blackCardValues = {3, 3, 3, 4, 4};
    int[] whiteCardValues = {2, 2, 2, 5, 5};
    CardType cardType = CardType.FULL_HOUSE;
    //when
    SameKindCardComparator sameKindCardComparator = new SameKindCardComparator();
    String result = sameKindCardComparator.compare(cardType, blackCardValues, whiteCardValues);

    //then
    assertEquals(result, BLACK_WINS);
  }

  @Test
  public void should_return_black_wins_when_compare_given_card_type_four_of_a_kind_and_black_card_values_3_3_3_3_4_and_white_card_values_2_2_2_2_5() {
    //given
    int[] blackCardValues = {3, 3, 3, 3, 4};
    int[] whiteCardValues = {2, 2, 2, 2, 5};
    CardType cardType = CardType.FOUR_OF_A_KIND;
    //when
    SameKindCardComparator sameKindCardComparator = new SameKindCardComparator();
    String result = sameKindCardComparator.compare(cardType, blackCardValues, whiteCardValues);

    //then
    assertEquals(result, BLACK_WINS);
  }

  @Test
  public void should_return_black_wins_when_compare_given_card_type_high_card_and_black_card_values_3_4_6_7_8_and_white_card_values_3_4_5_7_8() {
    //given
    int[] blackCardValues = {3, 4, 6, 7, 8};
    int[] whiteCardValues = {3, 4, 5, 7, 8};
    CardType cardType = CardType.HIGH_CARD;
    //when
    SameKindCardComparator sameKindCardComparator = new SameKindCardComparator();
    String result = sameKindCardComparator.compare(cardType, blackCardValues, whiteCardValues);

    //then
    assertEquals(result, BLACK_WINS);
  }

}
