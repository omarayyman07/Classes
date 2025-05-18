public class Tester {
    public static void translate(Point p, double dx, double dy){
        p.x+=dx;
        p.y+=dy;
    }

    public static void main(String[] args){
        Point p1=new Point(5,6);
        Point p2=new Point(1.6,2.5);
        p2.trans(-0.5,-3);
        System.out.println(p2.toString());
    }

}
