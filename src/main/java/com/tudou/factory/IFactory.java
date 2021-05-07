package com.tudou.factory;

public interface IFactory {

  /**
   * 创建口罩
   *
   * @return
   */
  IMask createMask();

  /**
   * 创建防护服
   *
   * @return
   */
  IProtectiveSuit createSuit();
}
