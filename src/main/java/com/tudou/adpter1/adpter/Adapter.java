package com.tudou.adpter1.adpter;

public class Adapter {

  int convert(int homeVolt) {
    // 适配过程：使用电阻、电容等器件将其降低为输出 5V
    return homeVolt - 215;
  }
}
