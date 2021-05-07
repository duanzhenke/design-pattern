package com.tudou.adpter1.adpter;

public class User {

  public static void main(String[] args) {
    HomeBattery homeBattery = new HomeBattery();
    int homeVolt  = homeBattery.supply();
    USBLine usbLine = new USBLine();
    usbLine.charge(homeVolt);
  }

}
