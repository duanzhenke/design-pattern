package com.tudou.chain;

/**
 * 责任链模式
 * @author Administrator
 */
 public abstract class Handler {

  protected Handler successor;

  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

  abstract String handleRequest(String msg);
}
