package com.ankur.goodgame.domain;

public enum SoldierType {
  SPEARMAN("Spearmen"),
  SWORDSMEN("Swordsmen"),
  ARCHERS("Archers");

  private final String value;

  SoldierType(String value) {
    this.value = value;
  }

  public static SoldierType fromValue(String label) {
    for (SoldierType e : values()) {
      if (e.value.equals(label)) {
        return e;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return  value ;
  }
}
