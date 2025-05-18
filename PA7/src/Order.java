public class Order {
    String restaurantName;
    double billTotal;
    double deliveryDuration;
    public Order(String restaurantName, double billTotal){
        this.restaurantName=restaurantName;
        this.billTotal=billTotal;
    }
    public Order(String restaurantName, double billTotal,double deliveryDuration){
        this.restaurantName=restaurantName;
        this.billTotal=billTotal;
        this.deliveryDuration=deliveryDuration;
    }
    public double tipsBasedOneDelivery(){
        if(deliveryDuration<=30){
            billTotal*=1.2;
        } else if (deliveryDuration<45) {
            billTotal*=1.15;
        }else{
            billTotal*=1.1;
        }
        return billTotal;
    }
    public static void main(String[] args){
        Order o1=new Order("Omar", 12.134,12);
        System.out.println(o1.tipsBasedOneDelivery());
    }
}
