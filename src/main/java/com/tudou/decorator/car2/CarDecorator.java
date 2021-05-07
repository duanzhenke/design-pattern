package com.tudou.decorator.car2;

public class CarDecorator implements Car {

  protected Car decoratedCar;

  public CarDecorator(Car decoratedCar) {
    this.decoratedCar = decoratedCar;
  }

  @Override
  public void run() {
    decoratedCar.run();
  }
}
