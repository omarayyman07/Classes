import java.util.*;
public class Circle {
    Point center;
    double radius;
    static int numberOfCircles;
    public Circle(){
        this(new Point(0,0),1);
        numberOfCircles++;
    }
    public Circle(Point center,double radius){
        this.center=center;
        this.radius=radius;
        numberOfCircles++;
    }
    public double getPerimter(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public void setRadius(double Radius){
        this.radius=Radius;
    }
    public void setCenter(Point Center){
        this.center=Center;
    }
    public static int getNumberOfCircles(){
        return numberOfCircles;
    }
}
