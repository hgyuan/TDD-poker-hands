package com.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PokerHandTest {

  /*
  given black: [2H, 3D, 5S, 9C, KD] white:[2C, 3H, 4S, 8C, AH]
  when porkerHand.play(black, white)
  then black wins
   */
  @Test
  public void should_return_black_wins_when_play_given_black_2H_3D_5S_9C_KD_and_white_2C_3H_4S_8C_AH() {
    //given
    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2C", "3H", "4S", "8C", "AH"};
    //when
    PokerHand pokerHand = new PokerHand();
    String result = pokerHand.play(black, white);

    //then
    assertEquals(result, "white wins");
  }

  @Test
  public void should_return_black_wins_when_play_given_black_2H_3D_5S_9C_KD_and_white_2C_3H_4S_8C_KH() {
    //given
    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2C", "3H", "5S", "8C", "KH"};
    //when
    PokerHand pokerHand = new PokerHand();
    String result = pokerHand.play(black, white);

    //then
    assertEquals(result, "black wins");
  }

  @Test
  public void should_return_tie_when_play_given_black_2H_3D_5S_9C_KD_and_white_2C_3H_4S_9C_KH() {
    //given
    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2C", "3H", "5S", "9C", "KH"};
    //when
    PokerHand pokerHand = new PokerHand();
    String result = pokerHand.play(black, white);

    //then
    assertEquals(result, "tie");
  }
}
