package com.tudou.decorator.car2;

public class BmwCar implements Car{
  @Override
  public void run() {
    System.out.println("宝马开车了！");
  }
}
