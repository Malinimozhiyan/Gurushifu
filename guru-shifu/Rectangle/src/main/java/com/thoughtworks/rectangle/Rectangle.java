package com.thoughtworks.rectangle;

public class Rectangle {
      private final double length;
      private final double breadth;
    public Rectangle(double length,double breadth)
    {
      this.length=length;
      this.breadth=breadth;
    }
    public double area()
    {
      double answer=length*breadth;
      return answer;
    }
    public double perimeter()
    {
      double perimeteranswer=2*(length+breadth);
      return perimeteranswer;
    }
}
