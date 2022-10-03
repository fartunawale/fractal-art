// Written by Fartun Awale, awale013

import java.lang.Math;
import java.awt.Color;

public class Rectangle {
  private double xpos;
  private double ypos;
  private double width;
  private double height;
  public Color color;

  // The constructor
  public Rectangle(double xpos, double ypos, double width, double height){
    this.xpos = xpos;
    this.ypos = ypos;
    this.width = width;
    this.height = height;
  }

  public double calculatePerimeter(){
    return 2*(this.height + this.width);
  }

  public double calculateArea(){
    return this.width*this.height;
  }

  public void setColor(Color color){
    this.color = color;
  }

  public void setPos(double xpos, double ypos){
    this.xpos = xpos;
    this.ypos = ypos;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public void setWidth(double width){
    this.width = width;
  }

  public Color getColor(){
    return this.color;
  }

  public double getXPos(){
    return this.xpos;
  }

  public double getYPos(){
    return this.ypos;
  }

  public double getHeight(){
    return this.height;
  }

  public double getWidth(){
    return this.width;
  }

  public static void main(String[] args){
    Rectangle newRectangle = new Rectangle(5, 6, 7, 8);

    System.out.println("\nGet x position: " + newRectangle.xpos);
    System.out.println("\nGet y position: " + newRectangle.ypos);
    System.out.println("\nGet height: " + newRectangle.height);
    System.out.println("\nGet width: " + newRectangle.width);
    System.out.println("\nGet color: " + newRectangle.color + "\n");

  }
}
