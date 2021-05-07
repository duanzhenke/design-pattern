package com.tudou.observer.day02;

/**
 * 宝石观察者  回调被观察者英雄
 *
 * @author Administrator
 */
public class Treasure implements Observer {

  @Override
  public void update() {
    if (inRange()) {
      System.out.println("宝石为英雄加血");
    }
  }


  private boolean inRange() {
    //判断主角是否在自己的影响范围内，这里忽略细节，直接返回true
    return true;
  }
}
