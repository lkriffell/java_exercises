package exercises.mo4;

import java.text.DecimalFormat;

public abstract class GeometricObject {
  private String color = "white";
  private boolean filled;

  /**Default construct*/
  protected GeometricObject() {
  }

  /**Construct a geometric object*/
  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  /**Getter method for color*/
  public String getColor() {
    return color;
  }

  /**Setter method for color*/
  public void setColor(String color) {
    this.color = color;
  }

  /**Getter method for filled. Since filled is boolean,
     so, the get method name is isFilled*/
  public boolean isFilled() {
    return filled;
  }

  /**Setter method for filled*/
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /**Abstract method findArea*/
  public abstract double getArea();
  

  /**Abstract method getPerimeter*/
  public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
	DecimalFormat df = new DecimalFormat("#.###");
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled) { 
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);	
        setFilled(filled);	
    }
	
	public void setSide1(double length) {
		side1 = length;
	}
	
	public void setSide2(double length) {
		side2 = length;
	}
	
	public void setSide3(double length) {
		side3 = length;
	}
	
	public String toString() {
		if (isFilled()) {
			return getColor() + " filled triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		} else {
			return getColor() + " unfilled triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		} 
		
	}
	
	@Override
	public double getArea() {
		double halfP = getPerimeter() / 2;
		return Double.parseDouble(df.format(Math.sqrt(halfP * (halfP - side1) * (halfP - side2) * (halfP - side3))));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
}

