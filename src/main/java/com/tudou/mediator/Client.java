package com.tudou.mediator;

import org.junit.Test;

/**
 * 模拟客户端调用
 *
 * @author duanzhenke
 */
public class Client {

  @Test
  public void test() {
   /* Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();
    Player player4 = new Player();
    // player1 赢了 player3 5 元
    player1.win(player3, 5);
    // player2 赢了 player1 10 元
    player2.win(player1, 10);
    // player2 赢了 player4 10 元
    player2.win(player4, 10);
    // player4 赢了 player3 7 元
    player4.win(player3, 7);

    // 输出：四人剩余的钱：105,120,88,97
    System.out.println("四人剩余的钱：" + player1.money + "," + player2.money + "," + player3.money + ","
        + player4.money);*/
  }


  @Test
  public void test02(){
    Group group = new Group();
    Player player1 = new Player(group);
    Player player2 = new Player(group);
    Player player3 = new Player(group);
    Player player4 = new Player(group);
    // player1 赢了 5 元
    player1.change(5);
    // player2 赢了 20 元
    player2.change(20);
    // player3 输了 12 元
    player3.change(-12);
    // player4 输了 3 元
    player4.change(-3);

    // 输出：四人剩余的钱：105,120,88,97
    System.out.println("四人剩余的钱：" + player1.money + "," + player2.money + "," + player3.money + "," + player4.money);
  }
}
