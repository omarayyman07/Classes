public class Point{
    int x;
    int y;
    static int noOfPoints;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
        noOfPoints++;
    }
    public static Point add(Point p1, Point p2){
        return new Point(p1.x+p2.x,p1.y+p2.y);
    }
    public void add(Point p){
        this.x+=p.x;
        this.y+=p.y;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public void swap(Point p){
        int tempX=this.x;
        int tempY=this.y;
        this.x=p.x;
        this.y=p.y;
        p.x=tempX;
        p.y=tempY;

    }
    public static void  swap(Point p1, Point p2){
        int temp=p1.x;
        p1.x=p2.x;
        p2.x=temp;
        temp=p1.y;
        p1.y=p2.y;
        p2.y=temp;
    }
    public static void main(String[] args){
        Point p1=new Point(1,3);
        Point p2=new Point(2,5);
        System.out.println(add(p1,p2));
        p1.add(p1);
        System.out.println(p1);
        System.out.println(noOfPoints);
    }

}