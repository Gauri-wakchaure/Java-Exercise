import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstnum = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Second Number: ");
        int secondnum = sc1.nextInt();

        int Result = firstnum + secondnum;
        System.out.println(Result);
        
        
    }
}