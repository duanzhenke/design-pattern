package com.tudou.factory;

public class LowEndFactory implements IFactory {
  @Override
  public IMask createMask() {
    IMask mask =  new LowEndMask();
    // .....
    //  LowEndMask的100行初始化代码
    return new LowEndMask();
  }

  @Override
  public IProtectiveSuit createSuit() {
    IProtectiveSuit suit =  new LowEndProtectiveSuit();
    // .....
    //  LowEndProtectiveSuit的100行初始化代码
    return new LowEndProtectiveSuit();
  }
}

