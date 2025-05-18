public class MovieTicket {
    String movieName;
    double basePrice;
    int age;
    boolean isWeekend;
    public MovieTicket(String movieName,double basePrice,int age,boolean isWeekend){
        this.movieName=movieName;
        this.basePrice=basePrice;
        this.age=age;
        this.isWeekend=isWeekend;
    }
    public double calculateFinalPrice(){
        double discount=1;
        if(age<12) {
            discount = 0.5;
        }else if(age>=60)
            discount=0.7;
        if(isWeekend)
            return (basePrice*discount)+20;
        return basePrice*discount;
    }
    public static void main(String[] args){
        MovieTicket m1= new MovieTicket("Omar",150,92,true);
    System.out.println(m1.calculateFinalPrice());
    }
}
