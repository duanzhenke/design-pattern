package com.tudou.decorator.car2;

public class FlyCarDecorator extends CarDecorator {
  public FlyCarDecorator(Car decoratedCar){
    super(decoratedCar);
  }
  @Override
  public void run(){
    decoratedCar.run();
    fly();
  }
  private void fly(){
    System.out.println("开启飞行汽车模式");
  }
}
