package com.tudou.observer;

/**
 * 观察者模式实现代码
 */
public class Hero extends Subject {

  public static void main(String[] args) {
    //初始化对象
    Hero hero = new Hero();
    Monster monster = new Monster();
    Trap trap = new Trap();
    Treasure treasure = new Treasure();
    //注册观察者
    hero.attachObserver(monster);
    hero.attachObserver(trap);
    hero.attachObserver(treasure);
    //移动事件
    hero.move();
  }

  public void move() {
    System.out.println("主角向前移动");
    notifyObservers();
  }

}
