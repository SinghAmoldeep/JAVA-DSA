public class binarysearch {
    public static int binarysearch(int[] array,int target,int low,int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high )/2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid]  > target) {
            return binarysearch(array, target, low, mid - 1);
        } else {
            return binarysearch(array, target, mid + 1, high);
        }
    }





    public static void main(String[] args) {
        int[] array={10};
        int target=10;
        int index=binarysearch(array,target,0,array.length-1);
        if(index!=-1){
            System.out.println("The element "+target+"found at"+index);
        }
        else {
            System.out.println("element not found");
        }
    }
}
