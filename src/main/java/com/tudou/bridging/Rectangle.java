package com.tudou.bridging;

public class Rectangle implements IShape {

  private IColor iColor;

  public Rectangle(IColor iColor) {
    this.iColor = iColor;
  }


  public void draw() {
    System.out.println("绘制" + iColor.getColor() + "圆形");
  }

  public void setiColor(IColor iColor) {
    this.iColor = iColor;
  }
}
