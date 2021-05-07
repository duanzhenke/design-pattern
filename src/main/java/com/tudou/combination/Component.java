package com.tudou.combination;

/**
 * @author duanzhenke
 */
public abstract class Component {

  private String position;
  private String job;


  public Component(String position, String job) {
    this.position = position;
    this.job = job;
  }

  public void work() {
    System.out.println("我是" + position + "，我正在" + job);
  }

  /**
   * 添加组件
   *
   * @param component
   */
  abstract void addComponent(Component component);

  /**
   * 移除组件
   *
   * @param component
   */
  abstract void removeComponent(Component component);

  abstract void check();
}
