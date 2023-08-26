import java.util.Scanner;
public class sumofarray {
    public static int findsum(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter"+n+"Elements");

        for(int i=0;i<n;i++) {
            array[i] = input.nextInt();
        }
        int sum = findsum(array);
        System.out.println("The sum is "+sum);
        }
    }
