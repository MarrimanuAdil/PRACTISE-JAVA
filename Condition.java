import java.util.Scanner;
public class Condition{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         
         System.out.print("enter the age :");
         int age =sc.nextInt();
        
        if(age>18){
            System.out.println("Ready to marry");
        
        }else{
            System.out.println("ready for school");
        }
    }
}