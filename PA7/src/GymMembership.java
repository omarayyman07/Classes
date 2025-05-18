public class GymMembership {
    String memberName;
    double monthlyRate;
    int membershipMonths;
    boolean hasTrainer;
    public GymMembership(String memberName, double monthlyRate, int membershipMonths, boolean hasTrainer){
        this.memberName=memberName;
        this.monthlyRate=monthlyRate;
        this.membershipMonths=membershipMonths;
        this.hasTrainer=hasTrainer;
    }
    public double totalPayment(){
        double baseCost=monthlyRate*membershipMonths;
        if (hasTrainer)
            baseCost+=200;
        if (membershipMonths>=12)
            baseCost*=0.85;
        return baseCost;
    }
    public static void main(String[] args){
        GymMembership g1=new GymMembership("Islam Makhachev",10,900,true);
        System.out.println(g1.totalPayment());
    }

}
