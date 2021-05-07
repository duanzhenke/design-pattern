package com.tudou.Facade;

import org.junit.Test;

public class Client {

  @Test
  public void test() {
    System.out.println("上班:");
    Browser.open();
    IDE.open();
    Wechat.open();
    System.out.println("下班:");
    Browser.close();
    IDE.close();
    Wechat.close();
  }

  @Test
  public void testFacade() {
    Facade facade = new Facade();
    System.out.println("上班:");
    facade.open();
    System.out.println("下班:");
    facade.close();
  }
}