package com.tudou.adpter1;

public class Adapter extends Adaptee implements Target {

  @Override
  public void method1() {
    super.method1();
  }

  @Override
  public void method2() {
    System.out.println("method 2");
  }
}
