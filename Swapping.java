package JavaDsa;
import java.util.*;
public class Swapping {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //input two numbers
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swapping the value of a is"+a+"and b is"+b);


        int temp=a;
        a=b;
        b=temp;

        System.out.println();
        System.out.println("After swapping the value of a is"+a+"and b is"+b);

    }
}
