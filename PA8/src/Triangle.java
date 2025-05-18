public class Triangle {
    Point p1;
    Point p2;
    Point p3;
    static int numberOfTriangles;
    public Triangle(){
        p1=new Point(0,0);
        p2=new Point(0,0);
        p3=new Point(0,0);
        numberOfTriangles++;
    }
    public Triangle(Point p1, Point p2, Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        numberOfTriangles++;
    }
    public Triangle copy(){
        return new Triangle(this.p1,this.p2,this.p3);
    }
    public void rotate(){
        Point temp = this.p1;
        this.p1 = this.p2;
        this.p2 = this.p3;
        this.p3 = temp;
    }
    public String toString(){
        return "Triangle is:"+" "+this.p1+","+this.p2+","+this.p3;
    }
    public static void main(String[] args){
        Triangle t1= new Triangle(new Point(3,2),new Point(4,6),new Point(3,5));
        Triangle t2=new Triangle();
        Triangle t3 = t1.copy();
        t1.copy();
        System.out.println(t3.toString());
        System.out.println(t1.toString());
        System.out.println(numberOfTriangles);

    }
}
