package com.tudou.mediator;

/**
 * 模拟中介者模式
 *
 * @author duznhenek
 */
public class Player {
  /*// 初始资金 100 元
  public int money = 100;

  public void win(Player player, int money) {
    // 输钱的人扣减相应的钱
    player.money -= money;
    // 自己的余额增加
    this.money += money;
  }*/

  public int money = 100;
  public Group group;

  public Player(Group group) {
    this.group = group;
  }

  public void change(int money) {
    // 输了钱将钱发到群里 或 在群里领取自己赢的钱
    group.money += money;
    // 自己的余额改变
    this.money += money;
  }
}
