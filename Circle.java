// Written by Fartun Awale, awale013

import java.lang.Math;
import java.awt.Color;

public class Circle {
  private double xpos;
  private double ypos;
  private double radius;
  public Color color;

  // The constructor
  public Circle(double xpos, double ypos, double radius){
    this.xpos = xpos;
    this.ypos = ypos;
    this.radius = radius;
  }

  public double calculatePerimeter(){
    return 2*Math.PI*this.radius;
  }

  public double calculateArea(){
    return Math.PI*Math.pow(this.radius,2);
  }

  public void setColor(Color color){
    this.color = color;
  }

  public void setPos(double xpos, double ypos){
    this.xpos = xpos;
    this.ypos = ypos;
  }

  public void setRadius(double radius){
    this.radius = radius;
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

  public double getRadius(){
    return this.radius;
  }

  public static void main(String[] args){
    Circle newCircle = new Circle(5, 6, 7);

    System.out.println("\nGet x position: " + newCircle.xpos);
    System.out.println("\nGet y position: " + newCircle.ypos);
    System.out.println("\nGet radius: " + newCircle.radius);
    System.out.println("\nGet color: " + newCircle.color + "\n");



  }
}
