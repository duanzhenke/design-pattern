package com.tudou.observer;

//宝物
public class Treasure implements Observer {

  @Override
  public void update() {
    if (inRange()) {
      System.out.println("宝物 为主角加血！");
    }
  }

  private boolean inRange() {
    //判断主角是否在自己的影响范围内，这里忽略细节，直接返回true
    return true;
  }
}
