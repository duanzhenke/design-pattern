package com.tudou.observer;

import java.util.ArrayList;
import java.util.List;

//被观察者
public class Subject {

  private List<Observer> observerList = new ArrayList<Observer>();

  public void attachObserver(Observer observer) {
    observerList.add(observer);
  }

  public void detachObserver(Observer observer) {
    observerList.remove(observer);
  }

  public void notifyObservers() {
    observerList.forEach(Observer::update);
  }
}
