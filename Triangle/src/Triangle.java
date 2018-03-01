// Chapter 12 Question 6 --> SVH

public abstract class Triangle 
{
//  private String type;
  private double side;

  public Triangle(double side)
  {
//    this.type = type;
    this.side = side;
  }

  public abstract double getPerimeter();
//  {
//    if ("equilateral".equals(type))
//      return 3 * side;
//    else if ("right".equals(type))
//      return (2 + Math.sqrt(2.0)) * side;
//    else
//      throw new IllegalArgumentException("Invalid triangle type");
//  }
 public double getSide() {
	 return side; 
 }
  public abstract double getArea();
//  {
//    if ("equilateral".equals(type))
//      return Math.sqrt(3) / 4 * side * side;
//    else if ("right".equals(type))
//      return side * side / 2;
//    else
//      throw new IllegalArgumentException("Invalid triangle type");
//  }

  public double getRatio()
  {
    return getArea()/getPerimeter();
  }

  public static void main(String[] args)
  {
//    Triangle equilateralTr = new Triangle("equilateral", 12);
//    Triangle rightTr = new Triangle("right", 12);
//    System.out.println("Equilateral " + equilateralTr.getRatio());
//    System.out.println("Right isosceles " + rightTr.getRatio());
	  
	  System.out.println("Btw's, the answer to b is the isosolese; the isosolese triangle will hold a circle with the largest radius");
  }
}
