package com.tudou.factory;

public class Test {

  public static void main(String[] args) {
    IFactory factoryA = new LowEndFactory();
    IFactory factoryB = new HighEndFactory();

    // 创建低端口罩
    IMask mask = factoryA.createMask();
    IProtectiveSuit suit = factoryB.createSuit();

    mask.showMask();
    suit.showSuit();


  }
}
