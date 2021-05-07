package com.tudou.chain;

public class HandlerC extends Handler {

  @Override
  String handleRequest(String msg) {
    if (msg.contains("c")) {
      msg = msg.replace('c', '*');
    } else if (this.successor != null) {
      msg = this.successor.handleRequest(msg);
    }
    return msg;
  }
}