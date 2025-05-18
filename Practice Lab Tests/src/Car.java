public class Car {
    String brand;
    int speed;
    static int totalCars;
    public Car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
        totalCars++;
    }
    public void accelerate(int value){
        this.speed+=value;
    }
    public String toString(){
        return "Brand: "+" "+this.brand+" "+"Speed: "+" "+this.speed;
    }


}
