package com.tudou.Facade;

public class Facade {

  public void open() {
    Browser.open();
    IDE.open();
    Wechat.open();
  }

  public void close() {
    Browser.close();
    IDE.close();
    Wechat.close();
  }
}
