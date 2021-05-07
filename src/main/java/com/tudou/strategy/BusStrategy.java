package com.tudou.strategy;

public class BusStrategy implements AbstractStrategy {

  @Override
  public void printTravelMethod() {
    System.out.println("by bus 乘坐汽车！");
  }
}
