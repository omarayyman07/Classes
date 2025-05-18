import java.util.*;
public class PairofDice {
    int d1;
    int d2;
    Random rand;
    public PairofDice(){
        rand = new Random();

    }
    public void roll(){
        d1=rand.nextInt(6)+1;
        d2=rand.nextInt(6)+1;

    }
    public int getFirstDice(){
        return this.d1;
    }
    public int getSecondDice(){
        return this.d2;
    }
    public int getTotal(){
        return this.d1+this.d2;
    }
    public static void main(String[] args){
        int count=1;
        int i=0;
        PairofDice n1= new PairofDice();
        while(n1.getTotal()!=2){
            n1.roll();
            count++;
        }
        System.out.println(count);
    }
}
