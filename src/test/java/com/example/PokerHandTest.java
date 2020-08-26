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

  @Test
  public void should_return_black_wins_when_play_given_black_2H_3H_4H_5H_6H_and_white_2C_3H_4S_8C_AH() {
    //given
    String[] black = {"2H", "3H", "4H", "5H", "6H"};
    String[] white = {"2C", "3H", "4S", "8C", "AH"};
    //when
    PokerHand pokerHand = new PokerHand();
    String result = pokerHand.play(black, white);

    //then
    assertEquals(result, "black wins");
  }

  @Test
  public void should_return_white_wins_when_play_given_black_2H_3H_4H_5H_6H_and_white_3H_4H_5H_6H_7H() {
    //given
    String[] black = {"2H", "3H", "4H", "5H", "6H"};
    String[] white = {"3H", "4H", "5H", "6H", "7H"};
    //when
    PokerHand pokerHand = new PokerHand();
    String result = pokerHand.play(black, white);

    //then
    assertEquals(result, "white wins");
  }

  @Test
  public void should_return_white_wins_when_play_given_black_2H_3H_4H_5H_6H_and_white_2D_3D_4D_5D_6D() {
    //given
    String[] black = {"2H", "3H", "4H", "5H", "6H"};
    String[] white = {"2D", "3D", "4D", "5D", "6D"};
    //when
    PokerHand pokerHand = new PokerHand();
    String result = pokerHand.play(black, white);

    //then
    assertEquals(result, "tie");
  }
}
