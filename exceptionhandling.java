package JavaDsa;

public class exceptionhandling {
    public  static void main(String args[]) {
        System.out.println("Enter an array");
        int array[] = {95, 96, 97, 98, 99};
        //put this in try if u think there is chance of any exception
        try{
            System.out.println(array[5]);

        }catch(Exception exception)
        {
            System.out.println("something we need to do about it");
            //the soultion to do something with thata exception
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);

        }
    }

}
