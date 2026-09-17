import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Second Number: ");
        int num2 = sc1.nextInt();
        
      int op = 3;

     switch(op){
         case 1: 
             System.out.println("Addition of two numbers is: "+(num1+num2));
             break;
         case 2: 
             System.out.println("Subtraction of two numbers is: "+(num1-num2));
             break;
         case 3: 
             System.out.println("Multiplication of two numbers is: "+(num1*num2));
             break;
         case 4: 
             System.out.println("Division of two numbers is "+(num1/num2));
             break;
         default:
             System.out.println("Wrong Choice");
         
     }
             
    }
}