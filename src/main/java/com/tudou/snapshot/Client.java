package com.tudou.snapshot;


import org.junit.Test;

/**
 * 备忘录模式
 *
 * @author dzk
 */
public class Client {

  @Test
  public void test() {
    Player player = new Player();
    // 存档
    int savedLife = player.getLife();
    int savedMagic = player.getMagic();

    // 打 Boss，打不过，壮烈牺牲
    player.fightBoss();

    // 读档，恢复到打 Boss 之前的状态
    player.setLife(savedLife);
    player.setMagic(savedMagic);
  }


  @Test
  public void test02() {
    Player player = new Player();
    // 存档
    Memento memento = player.saveState();

    // 打 Boss，打不过，壮烈牺牲
    player.fightBoss();

    // 读档
    player.restoreState(memento);
  }
}
