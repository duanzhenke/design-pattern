package com.tudou.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

/**
 * Java8Test
 *
 * @author Administrator
 */
public class Java8Test {
  /**
   * 业务逻辑分派Map
   * Function为函数式接口，下面代码中 Function<String, String> 的含义是接收一个Stirng类型的变量，返回一个String类型的结果
   */
  private Map<String, Function<String, String>> checkResultDispatcher = new HashMap<>();

  public void checkResultDispatcherInit() {
    checkResultDispatcher.put("校验1", order -> String.format("对%s执行业务逻辑1", order));
    checkResultDispatcher.put("校验2", order -> String.format("对%s执行业务逻辑2", order));
    checkResultDispatcher.put("校验3", order -> String.format("对%s执行业务逻辑3", order));
    checkResultDispatcher.put("校验4", order -> String.format("对%s执行业务逻辑4", order));
    checkResultDispatcher.put("校验5", order -> String.format("对%s执行业务逻辑5", order));
    checkResultDispatcher.put("校验6", order -> String.format("对%s执行业务逻辑6", order));
    checkResultDispatcher.put("校验7", order -> String.format("对%s执行业务逻辑7", order));
    checkResultDispatcher.put("校验8", order -> String.format("对%s执行业务逻辑8", order));
    checkResultDispatcher.put("校验9", order -> String.format("对%s执行业务逻辑9", order));
  }

  public String getCheckResultSuper(String order) {
    //从逻辑分派Dispatcher中获得业务逻辑代码，result变量是一段lambda表达式
    Function<String, String> result = checkResultDispatcher.get(order);
    if (result != null) {
      //执行这段表达式获得String类型的结果
      return result.apply(order);
    }
    return "不在处理的逻辑中返回业务错误";
  }


  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(4);

  }

}
