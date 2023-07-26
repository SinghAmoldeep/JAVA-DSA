package JavaDsa;
import java.util.*;
public class ReverseNo {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0 && a < 100) {
            int b = a / 10;
            int c = a % 10;
            System.out.println("The reversed no is " + c + b);
        }
        if(a>=100 && a<1000){
            int b=a/100;
            int e=a%100;
            int c=e/10;
            int d=a%10;
            System.out.println("The reversed number is "+d+c+b);
        }
    }
}