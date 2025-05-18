public class Garage {
    Car c1;
    Car c2;
    public Garage(Car c1, Car c2){
        this.c1=c1;
        this.c2=c2;
    }
    public Car fasterCar(){
        if(c1.speed>c2.speed){
            return c1;
        }else
            return c2;
    }
    public void swapCars(){
        Car temp=this.c2;
        Car temp2=this.c1;
        this.c1=temp;
        this.c2=temp2;
    }
    public String toString(){
        return "First Car:"+" "+ this.c1+"Second Car"+" "+this.c2;
    }
}
