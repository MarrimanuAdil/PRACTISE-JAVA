public class Max{
    public static void main(String[] args){
        int a=12;
        int b=56;
        int c=90;

        int max;

        if(a>=b && a>=c){
            max =a;
        }else if(b>=a && b >=c){
            max= b;
        }
        else {
            max =c;
        }
        System.out.println("the maximum number is :" + max);

        
    }
}