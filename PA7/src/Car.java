public class Car {
    String make;
    String model;
    int year;
    public Car(String ma, String mo, int y){
        make=ma;
        model=mo;
        year=y;
    }
    public static void displayInfor(Car c){
        System.out.println("Make:"+c.make+", Model:"+c.model+", year:"+c.year);
    }
    public void displayInfo(){
        System.out.println("Make:" + make + ", Model:" + model +", year:" + year);
    }
    public static void main(String[] args){
        Car c1 = new Car("BMW","3-series", 2020);
        Car c2 = new Car("Tesla","model S", 2022);
        c1.displayInfo();
        c2.displayInfo();

}}
