package com.tudou.strategy;

/**
 * 策略模式  其实就是 if else 的替换  逻辑委派
 *
 * @author Administrator
 */
public class Client {

  /**
   * 拿到抽象的策略对象！！！
   */
  AbstractStrategy abstractStrategy;

  public void setAbstractStrategy(AbstractStrategy abstractStrategy) {
    this.abstractStrategy = abstractStrategy;
  }

  public void printMethod() {
    abstractStrategy.printTravelMethod();
  }
}
