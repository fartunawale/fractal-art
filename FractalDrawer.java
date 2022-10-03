// Written by Fartun Awale, awale013

// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    public Color[] cArr;

    public FractalDrawer() {}  // contructor
    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper
    //function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
      Canvas newCanvas = new Canvas(1000,1500);
      newCanvas.setBackground(Color.BLACK);

      cArr = new Color[]{Color.CYAN, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE,
         Color.RED, Color.PINK, Color.WHITE};

      if (type.equals("circle")){
        Circle circ1 = new Circle(1,2,3);
        drawCircleFractal(175, 725, 400, cArr[0], newCanvas , 0);
        return totalArea;
      }
      else if (type.equals("rectangle")){
        Rectangle rec1 = new Rectangle(7,8,9,10);
        drawRectangleFractal(100,200,600,395, cArr[0], newCanvas, 0);
        return totalArea;
      }
      else if (type.equals("triangle")){
        Triangle tri1 = new Triangle(3,4,5,6);
        drawTriangleFractal(150,150,400,400, cArr[0], newCanvas, 0);
        return totalArea;
      }
      else{ // if user input is incorrect input
        System.out.println("Wrong input");
      }
      return totalArea;
    }

    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x,
    double y, Color c, Canvas can, int level){
        Triangle tri2 = new Triangle(x, y, width, height);
        tri2.setColor(cArr[level]);
        can.drawShape(tri2);
        totalArea += tri2.calculateArea();
        // BASE CASE
        if (level < 7){
          drawTriangleFractal(width/1.75, height/1.75, x-width/2, y, c, can, level+1);
          drawTriangleFractal(width/1.75, height/1.75, x+2*width, y+height, c, can, level+1);
          drawTriangleFractal(width/1.75, height/1.75, x+width/2, y-height, c, can, level+1);

          // drawTriangleFractal(width/1.75, height/1.75, x-height/2, y-height/2, c, can, level+1);
          // drawTriangleFractal(width/1.75, height/1.75, x+2*width, y-2*width, c, can, level+1);
          // drawTriangleFractal(width/1.75, height/1.75, x+height/2, y+height/2, c, can, level+1);
        }

    }
    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c,
      Canvas can, int level) {
        Circle circ2 = new Circle(x, y, radius);
        circ2.setColor(cArr[level]);
        totalArea += circ2.calculateArea();
        can.drawShape(circ2);
        // BASE CASE
        if (level < 7){
          drawCircleFractal(radius/2, x, y+radius, c, can, level+1);
          drawCircleFractal(radius/2, x-2*radius, y, c, can, level+1);
          drawCircleFractal(radius/2, x+2*radius, y, c, can, level+1);
          drawCircleFractal(radius/2, x, y-radius, c, can, level+1);
        }
    }
    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double
      y, Color c, Canvas can, int level) {
        Rectangle rec2 = new Rectangle(x, y, width, height);
        rec2.setColor(cArr[level]);
        can.drawShape(rec2);
        totalArea += rec2.calculateArea();
        // BASE CASE
        if (level < 7){
          drawRectangleFractal(width/2, height/2, x-width, y-height, c, can, level+1);
          drawRectangleFractal(width/2, height/2, x+2*width, y+width, c, can, level+1);
          drawRectangleFractal(width/2, height/2, x-2*width, y-width, c, can, level+1);
          drawRectangleFractal(width/2, height/2, x+width, y+height, c, can, level+1);
        }
    }
    //TODO:
    // main should ask user for shape input, and then draw the corresponding
    //fractal.
    // should print area of fractal
    public static void main(String[] args){
      FractalDrawer shape = new FractalDrawer();
      Scanner input = new Scanner(System.in);
      System.out.println("\nChoose a, b, or c: \n a. circle\n b. rectangle\n c. triangle\n");
      String output = input.nextLine();

      if (output.equals("c")){
        shape.drawFractal("triangle");
        System.out.println("\nThe area of the triangle is: " + shape.totalArea + "\n");
      }
      else if (output.equals("a")){
        shape.drawFractal("circle");
        System.out.println("\nThe area of the circle is: " + shape.totalArea + "\n");
      }
      else if (output.equals("b")){
        shape.drawFractal("rectangle");
        System.out.println("\nThe area of the rectangle is: " + shape.totalArea + "\n");
      }
      else{
        System.out.println("\nIncorrect input, try again.\n");
      }

    }
}
