public class Room {
    int roomNumber;
    String guestName;
    double rate;
    int numberOfDaysRented;
    int numberOfBeds;
    public Room(String guestName,int roomNumber,int numberOfBeds,double rate,int numberOfDaysRented){
        this.roomNumber=roomNumber;
        this.guestName=guestName;
        this.rate=rate;
        this.numberOfDaysRented=numberOfDaysRented;
        this.numberOfBeds=numberOfBeds;
    }
    public double calculateTotal(){
        return numberOfDaysRented*rate;
    }
    public int addBed(){
        return (this.numberOfBeds==2)? (2):(1);
    }
    public String toString(){
        return "Guest Name is "+ " "+ this.guestName+" "+"Room no:"+" "+this.roomNumber+" "+"No of Beds"+" "+this.numberOfBeds+" "+"Rental Rate"+" "+this.rate+" "+"Number of days:"+ " "+this.numberOfDaysRented;
    }
    public static void main(String[] args){
        Room r1= new Room("Blake", 123, 1, 123.50, 5);
        System.out.println(r1.calculateTotal());
        r1.addBed();
        System.out.println(r1.toString());
    }
}
