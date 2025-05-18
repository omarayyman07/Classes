public class Complex {
    double real;
    double imaginairy;
    public Complex(double real, double imaginairy){
        this.real=real;
        this.imaginairy=imaginairy;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginairy(){
        return this.imaginairy;
    }
    public void add(Complex cvalue){
        this.real+=cvalue.real;
        this.imaginairy+=cvalue.imaginairy;
    }
    public static Complex add(Complex cvalue1, Complex cvalue2){
        return new Complex(cvalue1.real+ cvalue2.real,cvalue1.imaginairy+cvalue2.imaginairy);
    }
    public void subtract(Complex cvalue){
        this.real-=cvalue.real;
        this.imaginairy-=cvalue.imaginairy;
    }
    public static Complex subtract(Complex cvalue1, Complex cvalue2){
        return new Complex(cvalue1.real- cvalue2.real,cvalue1.imaginairy-cvalue2.imaginairy);
    }
    public String display(){
        return this.real+"+"+this.imaginairy+"i";
    }
    public static void main(String[] args){
        Complex c1=new Complex(3.2,5.6);
        Complex c2=new Complex(2.9,1.2);
        Complex c3=Complex.add(c1,c2);
        Complex c4=Complex.subtract(c2,c1);
        c1.add(c2);
        System.out.println(c4.display());
    }
}
