package com.tudou.combination;

public class Employee extends Component {

  public Employee(String position, String job) {
    super(position, job);
  }

  @Override
  void addComponent(Component component) {
    System.out.println("职员没有管理权限");
  }

  @Override
  void removeComponent(Component component) {
    System.out.println("职员没有管理权限");
  }

  /**
   * 检查下属
   */
  @Override
  void check() {
    work();
  }

}
