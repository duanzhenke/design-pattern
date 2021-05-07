package com.tudou.chain;

public class HandlerA extends Handler {

  @Override
  String handleRequest(String msg) {
    if (msg.contains("a")) {
      msg = msg.replace('a', '*');
    } else if (this.successor != null) {
      msg = this.successor.handleRequest(msg);
    }
    return msg;
  }
}
