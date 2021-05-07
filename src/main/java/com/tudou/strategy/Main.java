package com.tudou.strategy;

/**
 * Main
 *
 * @author 荀彧 2020/10/4
 */
public class Main {
  public static void main(String[] args) {
    Client client = new Client();
    AbstractStrategy bus = new BusStrategy();
    AbstractStrategy train = new TrainStrategy();
    client.setAbstractStrategy(bus);
    client.printMethod();
    client.setAbstractStrategy(train);
    client.printMethod();
  }
}