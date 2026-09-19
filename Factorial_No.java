public import java.util.Scanner;

class Factorial_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int fact = 5;
        
        for(int i=1; i<number; i++) {
            fact = fact * i;
        }
          System.out.println(fact);
    }                   
 }
