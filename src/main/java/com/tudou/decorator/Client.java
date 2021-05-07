package com.tudou.decorator;

/**
 * 装饰器模式，实现
 */
public class Client {

  public static void main(String[] args) {
    Me me = new Me();
    System.out.println("我原本的颜值：" + me.getBeautyValue());

    RingDecorator ringDecorator = new RingDecorator(me);
    System.out.println("戴上了戒指后，我的颜值：" + ringDecorator.getBeautyValue());
  }

}
