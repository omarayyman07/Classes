import org.w3c.dom.css.Rect;

public class Rectangle {
    double width;
    double height;
    public Rectangle(){
        this(1,1);
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    public void setWidth(double x){
        this.width=x;
    }
    public void setHeight(double x){
        this.height=x;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        r1.setHeight(12.4);
        r1.setWidth(9.0);
        System.out.println(r1.height);
        System.out.println(r1.width);

    }
}
