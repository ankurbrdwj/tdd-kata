package com.ankur.goodgame.service;

import com.ankur.goodgame.domain.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRandomArmy {
  private ArmyService armyService;

  @BeforeEach
  void setUp(){
    armyService = new ArmyService();
  }


  @Test
  public void testArmyCreation() {
    int total = 167;
    int kindOfTroops = 3;
    //Soldier[] troops = armyService.createArmy(total, kindOfTroops);
    //Assertions.assertEquals(167, Arrays.stream(troops).sum());
    // create troops Of Soldiers
  }


}
