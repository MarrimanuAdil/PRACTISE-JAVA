import java.util.Scanner;
public class Voter{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the age: ");
        int age =sc.nextInt();

         
        
        if(age>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Just leave from");
        }
        sc.close();

    }
} 