import java.util.*;
public class Main{
    public static void main(String[] args){
        Point p1= new Point();
        Circle c1=new Circle(p1,10);
        Circle c2=new Circle();
        Circle c3= new Circle();
        System.out.println(p1);
        System.out.println(c1.getPerimter());
        System.out.println(c1.getArea());
        c1.setRadius(25);
        System.out.println(c1.radius);
        System.out.println(c1.center);
        System.out.println(Circle.numberOfCircles);
}}