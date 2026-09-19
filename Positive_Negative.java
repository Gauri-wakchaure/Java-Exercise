import java.util.Scanner;

class Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if(number > 0) {
            System.out.println("Number is Positive");
        }else if(number < 0) {
            System.out.println("Number is  Negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
}