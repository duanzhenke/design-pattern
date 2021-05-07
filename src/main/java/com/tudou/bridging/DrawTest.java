package com.tudou.bridging;

/**
 * 桥接模式
 * @author Administrator
 */
public class DrawTest {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(new Red());
    rectangle.draw();

    Triangle round = new Triangle(new Red());
    round.draw();


  }

}
