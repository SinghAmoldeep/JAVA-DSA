package JavaDsa;

public class function {
    public static void function(){
        System.out.println("hello");
    }
    public static void sum(int a ,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void concat(String a,String b){
        String c= a.concat(b);
        System.out.println(c);
    }
    public static void main(String args[]){
        function();
        function();
        function();
        sum(1,5);
        concat("jatt","ontop");
    }
}
