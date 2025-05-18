import java.util.*;
public class Airplane {
    String Name;
    double ew;
    int nos;
    double fcons;
    public Airplane(String Name,int nos){
        this.Name=Name;
        this.nos=nos;
    }
    public Airplane(String Name,double ew,int nos,double fcons){
        this.Name=Name;
        this.nos=nos;
        this.ew=ew;
        this.fcons=fcons;
    }
    public String getName(){
        return Name;
    }
    public double getEmptyWeight(){
        return ew;
    }
    public int getSeats(){
        return nos;
    }
    public double getFuelConsumption(){
        return fcons;
    }
    public void AddSeats(int x){
        nos+=x;
    }
    public String display(){
        return "Name: "+ Name+ "Empty Weight: "+ew+"No Seats: "+nos+"Fuel Cons:"+fcons;
    }
    public static void display(Airplane a){
        System.out.println("Name: "+ a.Name+ "Empty Weight: "+a.ew+"No Seats: "+a.nos+"Fuel Cons:"+a.fcons);
    }
    public int compare(Airplane a){
        return nos-a.nos;
    }
    public static int compare(Airplane a, Airplane b){
        return a.nos-b.nos;
    }
    public static void main(String[] args){
        Airplane a= new Airplane("Boeing", 200);
        System.out.println(a.getSeats());
        a.AddSeats(50);
        System.out.println(a.getSeats());
        System.out.println(a.display());
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Name");
        String x =sc.next();
        System.out.println("Enter Empty Weight");
        int y=sc.nextInt();
        System.out.println("Enter Number of Seats");
        int z=sc.nextInt();
        System.out.println("Enter Fuel Consumption");
        int q = sc.nextInt();
        Airplane b= new Airplane(x,y,z,q);
        System.out.println((a.compare(b)>=0)? a.getName(): b.getName());
        System.out.println((compare(a,b)>=0)? a.getName(): b.getName());
    }
}
