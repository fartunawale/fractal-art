// Written by Fartun Awale, awale013

import java.lang.Math;
import java.awt.Color;

public class Triangle {
  private double xpos;
  private double ypos;
  private double width;
  private double height;
  public Color color;

  public Triangle(double xpos, double ypos, double width, double height){
    this.xpos = xpos;
    this.ypos = ypos;
    this.width = width;
    this.height = height;
  }

  public double calculatePerimeter(){
    return 2*Math.sqrt(this.height*this.height+(this.width*this.width)/4)+this.width;
  }

  public double calculateArea(){
    return 0.5*this.width*this.height;
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
    // how to get the bottom left corner of y pos
    return this.ypos;
  }

  public double getHeight(){
    return this.height;
  }

  public double getWidth(){
    return this.width;
  }

  public static void main(String[] args){
    Triangle newTriangle = new Triangle(5, 6, 7, 8);

    System.out.println("\nGet x position: " + newTriangle.xpos);
    System.out.println("\nGet y position: " + newTriangle.ypos);
    System.out.println("\nGet height: " + newTriangle.height);
    System.out.println("\nGet width: " + newTriangle.width);
    System.out.println("\nGet color: " + newTriangle.color + "\n");
  }
}
