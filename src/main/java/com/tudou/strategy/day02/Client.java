package com.tudou.strategy.day02;

public class Client {

  public static void main(String[] args) {

    Context context = new Context(new ConcreteStrategyA());
    context.contextInterface();

   /* context = new Context(new ConcreteStrategyB());
    context.contextInterface();

    context = new Context(new ConcreteStrategyC());
    context.contextInterface();*/
  }

}
