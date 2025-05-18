import java.awt.*;

public class Clerk {
    String fn;
    String ln;
    int yob;
    int s;
    boolean ms;
    public Clerk(String fn, String ln, int yob, int s, boolean ms){
        this.fn=fn;
        this.ln=ln;
        this.yob=yob;
        this.s=s;
        this.ms=ms;
    }
    public static void category(Clerk a, int n){
        a.s=n;
    }
    public void m(){
        ms=true;
    }
    public void d(){
        ms=false;
    }
    public double calc(int ty){
        double sal;
        sal=2000*((100+(17/9)*s))/100;
        int age =ty-yob;
        int nb=0;
        if(age>=30)
            nb=(age-30)/5;
        s=((100+nb)/100)*s;
        if (ms)
            s+=(12.3/100)*s;
        return s;

    }
    public static String compareTo(Clerk a, Clerk b,int y){
        double s1=a.calc(y);
        double s2 = b.calc(y);
        String HSN="";
        HSN=s1>s2?a.fn:b.fn;
        return "The salary of "+HSN+"is higher by"+Math.abs(s1-s2);
    }
public static void main(String[] args){
    Clerk c1 = new Clerk ("Sarah", "Ahmed", 2007, 1, false);
    Clerk c2 = new Clerk ("John", "Shoukry", 1980, 1, false);
    c1.m();
    category(c2,7);
    System.out.println("c1 earns"+c1.calc(2025));
    System.out.println("c2 earns "+c2.calc(2025));
    System.out.println(compareTo(c1,c2,2025));
}

}
