package com.tudou.decorator.car2;

public class AutoCarDecorator extends CarDecorator {

  public AutoCarDecorator(Car decoratedCar) {
    super(decoratedCar);
  }

  @Override
  public void run() {
    decoratedCar.run();
    autoRun();
  }

  private void autoRun() {
    System.out.println("开启自动驾驶");
  }
}
