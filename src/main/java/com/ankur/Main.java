package com.ankur;

import com.ankur.goodgame.domain.SoldierType;
import com.ankur.goodgame.service.ArmyService;

public class Main {
  public static void main(String[] args) {
    ArmyService armyService = new ArmyService();
    if (args.length == 0) {
      throw new RuntimeException("Please provide size of army to be generated.");
    }
    int size = Integer.parseInt(args[0]);
    SoldierType[] types = SoldierType.values();
    int[] troops = armyService.createArmy(size, types.length);

    System.out.println("Generating Army of size: " + size);
    for (int i = 0; i < troops.length; i++) {
      System.out.println(troops[i] + " " + types[i].toString());
    }
  }
}
