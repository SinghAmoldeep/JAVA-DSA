import java.util.Scanner;
public class fact {

        public static int factorial(int n){
            if(n<=1){
                return n;
            }
            else {
                return factorial(n-1)+factorial(n-2);
            }
        }



    public static void main(String[] args) {

        System.out.println("Enter the no.th position in fibonnaci u want to find");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("The number at nth position is "+result);
    }
}
