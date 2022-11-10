package com.ankur.goodgame.service;

import com.ankur.goodgame.domain.Soldier;
import java.util.Random;

public class ArmyService {
  public int[] createArmy(int total, int kindOfTroops) {
    int[] nums = new int[kindOfTroops];
    Random rand = new Random();
    for (int i = 0; i < nums.length - 1; i++) {
      nums[i] = rand.nextInt(total);
      total -= nums[i];
    }
    nums[nums.length - 1] = total;
    return nums;
  }
}
