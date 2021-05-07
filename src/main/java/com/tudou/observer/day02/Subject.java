package com.tudou.observer.day02;


import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者抽象  迷宫中的英雄 ，持有观察者的列表
 *
 * @author Administrator
 */
public abstract class Subject {

  private List<Observer> observerList = new ArrayList<Observer>();

  public void attachObserver(Observer observer) {
    observerList.add(observer);
  }

  public void detachObserver(Observer observer) {
    observerList.remove(observer);
  }

  public void notifyObservers() {
    for (Observer observer : observerList) {
      observer.update();
    }
  }
}
