import java.util.Scanner;

public class P512 {
    public static int multiply(int a){
        int temp=0;
        int product =1;
        while (a>0){
            temp=a%10;
            product*=temp;
            a/=10;
        }
        return product;
    }
    public static int Persistant(int a){
       int count=0;
       int n=a;
       while (n>10){
           n=multiply(n);
           count++;
       }
       return count;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its multiplicative persistence: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplicative persistence of " + number + " is: " + Persistant(number));
        
        scanner.close();
    }
} 