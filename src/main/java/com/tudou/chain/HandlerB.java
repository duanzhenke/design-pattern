package com.tudou.chain;

public class HandlerB extends Handler {
  @Override
  String handleRequest(String msg) {
    if(msg.contains("b")){
      msg = msg.replace('b', '*');
    } else if(this.successor != null){
      msg = this.successor.handleRequest(msg);
    }
    return msg;
  }
}
