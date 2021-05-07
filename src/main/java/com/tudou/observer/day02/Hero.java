package com.tudou.observer.day02;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.tudou.observer.Trap;
import org.junit.Test;

/**
 * 英雄 被观察者模式
 *
 * @author Administrator
 */
public class Hero extends Subject {

  void move() {
    System.out.println("主角向前移动");
    notifyObservers();
  }
  @Test
  public void test(){
    Hero hero = new Hero();

    Monster monster = new Monster();
    Treasure treasure = new Treasure();

    hero.attachObserver(monster);
    hero.attachObserver(treasure);

    hero.move();


  }
}
