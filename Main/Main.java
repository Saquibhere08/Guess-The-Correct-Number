package mini_Project;
import java.util.Scanner;
//Mini-Project
//Guess the Random Number.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=(int)(Math.random()*100);
        int userNumber=0;

        do{
            System.out.println("Enter your Number: ");
            userNumber=sc.nextInt();
            if(userNumber==num){
                System.out.println("Wohooooooooooooo Correct Number....");
                break;    
            }
            else if(userNumber>num){
                System.out.println("Your Number is toooo Large.");
            }
            else{
                System.out.println("Your Number is toooo Small.");
            }
        }while(userNumber>=0);

        System.out.println("The Number was: ");
        System.out.println(num);
    }
}
