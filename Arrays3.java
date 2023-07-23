//program to enter elements in array and find the X element.
package JavaDsa;
import java.util.*;
public class Arrays3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int array_size = sc.nextInt();
        System.out.println("Enter elements");
        int numbers[] = new int[array_size];
        for(int i=0;i<array_size;i++){
            numbers[i]=sc.nextInt();
        }
        //X element
        System.out.println("Enter X");
        int X = sc.nextInt();

        //input

        //output
        for(int i=0;i<array_size;i++){
            if(numbers[i]==X){
                System.out.println("Element is found at  "+i);

            }
        }

    }
}
