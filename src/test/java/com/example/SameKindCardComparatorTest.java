package com.example;

import org.testng.annotations.Test;

import static com.example.Constant.*;
import static org.testng.Assert.assertEquals;

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

  @Test
  public void should_return_white_wins_when_compare_given_card_type_two_pairs_and_black_card_values_2_2_4_4_8_and_white_card_values_3_3_5_5_8() {
    //given
    int[] blackCardValues = {2, 2, 4, 4, 8};
    int[] whiteCardValues = {3, 3, 5, 5, 8};
    CardType cardType = CardType.TWO_PAIRS;
    //when
    SameKindCardComparator sameKindCardComparator = new SameKindCardComparator();
    String result = sameKindCardComparator.compare(cardType, blackCardValues, whiteCardValues);

    //then
    assertEquals(result, WHITE_WINS);
  }

  @Test
  public void should_return_tie_when_compare_given_card_type_two_pairs_and_black_card_values_2_2_4_4_8_and_white_card_values_2_2_4_4_8() {
    //given
    int[] blackCardValues = {2, 2, 4, 4, 8};
    int[] whiteCardValues = {2, 2, 4, 4, 8};
    CardType cardType = CardType.TWO_PAIRS;
    //when
    SameKindCardComparator sameKindCardComparator = new SameKindCardComparator();
    String result = sameKindCardComparator.compare(cardType, blackCardValues, whiteCardValues);

    //then
    assertEquals(result, TIE);
  }

  @Test
  public void should_return_white_wins_when_compare_given_card_type_two_pairs_and_black_card_values_2_2_4_4_5_and_white_card_values_2_2_4_4_6() {
    //given
    int[] blackCardValues = {2, 2, 4, 4, 5};
    int[] whiteCardValues = {2, 2, 4, 4, 6};
    CardType cardType = CardType.TWO_PAIRS;
    //when
    SameKindCardComparator sameKindCardComparator = new SameKindCardComparator();
    String result = sameKindCardComparator.compare(cardType, blackCardValues, whiteCardValues);

    //then
    assertEquals(result, WHITE_WINS);
  }

}
