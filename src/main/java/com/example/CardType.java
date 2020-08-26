package com.example;

public enum CardType {

  STRAIGHT_FLUSH("Straight flush", 9),
  FOUR_OF_A_KIND("Four of a kind", 8),
  FULL_HOUSE("Full House", 7),
  FLUSH("Flush", 6),
  STRAIGHT("Straight", 5),
  THREE_OF_A_KIND("Three of a Kind", 4),
  TWO_PAIRS("Two Pairs", 3),
  PAIR("Pair",2),
  HIGH_CARD("High card", 1);

  private String typeName;
  private Integer typeNumber;

  private CardType(String typeName, Integer typeNumber) {
    this.typeName = typeName;
    this.typeNumber = typeNumber;
  }
  public Integer getTypeNumber() {
    return typeNumber;
  }

}
