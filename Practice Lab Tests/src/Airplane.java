import java.awt.*;
import java.util.*;
public class Airplane {
    String name;
    double emptyWeight;
    int noOfSeats;
    double fuelConsump;
    public Airplane(String name,int noOfSeats){
        this.name=name;
        this.noOfSeats=noOfSeats;
    }
    public Airplane(String name,double emptyWeight,int noOfSeats,double fuelConsump){
        this.name=name;
        this.fuelConsump=fuelConsump;
        this.noOfSeats=noOfSeats;
        this.emptyWeight=emptyWeight;
    }
    public String getName(){
        return this.name;
    }
    public double getEmptyWeight(){
        return this.emptyWeight;
    }
    public int getNoOfSeats(){
        return this.noOfSeats;
    }
    public double getFuelConsump(){
        return this.fuelConsump;
    }
    public void AddSeats(int x){
        this.noOfSeats+=x;
    }
    public String display(){
        return "Name: "+ this.name+"\n Empty Weight:"+this.emptyWeight+"\n No of Seats:"+this.noOfSeats+"\n Fuel Consumption:"+this.fuelConsump;
    }
    public static void display(Airplane a){
        System.out.println( "Name: "+ a.name+"\n Empty Weight:"+a.emptyWeight+"\n No of Seats:"+a.noOfSeats+"\n Fuel Consumption:"+a.fuelConsump);
    }
    public int compare(Airplane a){
        return Math.abs(this.noOfSeats-a.noOfSeats);
    }
    public static int compare(Airplane a,Airplane b){
        return Math.abs(a.noOfSeats-b.noOfSeats);
    }
    public static void main(String[] args){
        Airplane a1=new Airplane("Boeing",200);
        System.out.println(a1.noOfSeats);
        a1.AddSeats(50);
        System.out.println(a1.noOfSeats);
        System.out.println(a1.display());

    }
}
