package com.tudou.bridging;

public class Triangle implements IShape {

  private IColor iColor;

  public Triangle(IColor iColor) {
    this.iColor = iColor;
  }


  public void draw() {
    System.out.println("绘制" + iColor.getColor() + "三角形");
  }

  public void setiColor(IColor iColor) {
    this.iColor = iColor;
  }
}
