import java.util.Scanner;
public class maxelementinarray {

    public static int findmax(int[] array){
        int max_elem=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max_elem){
                max_elem=array[i];
            }
        }
        return max_elem;
    }

    public static void main(String[] args) {
        int n=4;
        Scanner sc=new Scanner(System.in);
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int max_elem=findmax(array);
        System.out.println("The maximum element in the array is "+ max_elem);
    }
}
