public class Account {
    int id;
    double balance;
    Date dateCreated;
    static double addMoney;
    public Account(int id, double balance, Date dateCreated){
        this.id=id;
        this.balance=balance;
        this.dateCreated=dateCreated;
        addMoney+=100;
    }
    public boolean withdraw(double x){
        return (x>this.balance)?(false):(true);

    }
    public void deposit(double x){
        this.balance+=x;
    }
}
