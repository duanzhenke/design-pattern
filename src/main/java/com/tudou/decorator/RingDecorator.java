package com.tudou.decorator;

public class RingDecorator implements IBeauty {

  private final IBeauty me;

  public RingDecorator(IBeauty me) {
    this.me = me;
  }

  @Override
  public int getBeautyValue() {
    return me.getBeautyValue() + 20;
  }
}
