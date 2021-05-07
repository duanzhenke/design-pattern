package com.tudou.combination;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Component {


  /**
   * 管理者的组件
   */
  private List<Component> components = new ArrayList<>();

  public Manager(String position, String job) {
    super(position, job);
  }

  @Override
  void addComponent(Component component) {
    components.add(component);
  }

  @Override
  void removeComponent(Component component) {
    components.remove(component);
  }

  /**
   * 检查下属
   */
  @Override
  void check() {
    work();
    components.forEach(Component::check);
  }
}
