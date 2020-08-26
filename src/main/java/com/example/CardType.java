package com.example;

public enum CardType {

  STRAIGHT_FLUSH("Straight flush", 9),
  HIGHT_CARD("Hight card", 1);


  private String typeName;
  private Integer typeNumber;

  private CardType(String typeName, Integer typeNumber) {
    this.typeName = typeName;
    this.typeNumber = typeNumber;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Integer getTypeNumber() {
    return typeNumber;
  }

  public void setTypeNumber(Integer typeNumber) {
    this.typeNumber = typeNumber;
  }
}
