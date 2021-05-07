package com.tudou.decorator.car2;

public class TeslaCar implements Car{
  @Override
  public void run() {
    System.out.println("特斯拉开车了！");
  }
}