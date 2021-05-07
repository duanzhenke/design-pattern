package com.tudou.decorator.car2;

public class Client {

  public static void main(String[] args) {
    Car benzCar = new BenzCar();
    Car bmwCar = new BmwCar();
    Car teslaCar = new TeslaCar();
//创建自动驾驶的奔驰汽车
    CarDecorator autoBenzCar = new AutoCarDecorator(benzCar);
//创建飞行的、自动驾驶的宝马汽车
    CarDecorator flyAutoBmwCar = new FlyCarDecorator(new AutoCarDecorator(bmwCar));
    benzCar.run();
    bmwCar.run();
    teslaCar.run();
    autoBenzCar.run();
    flyAutoBmwCar.run();
  }
}
