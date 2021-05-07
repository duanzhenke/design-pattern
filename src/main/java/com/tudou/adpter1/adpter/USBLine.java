package com.tudou.adpter1.adpter;

public class USBLine {

  void charge(int volt) {
    if (5 != volt) {
      throw new IllegalArgumentException("只能接收 5V 电压");
    }
    // 如果电压是 5V，正常充电
    System.out.println("正常充电");
  }
}
