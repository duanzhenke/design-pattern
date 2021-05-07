package com.tudou.decorator.car2;

public class BenzCar implements Car {

  @Override
  public void run() {
    System.out.println("奔驰开车了！");
  }
}
