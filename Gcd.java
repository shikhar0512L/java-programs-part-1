import java.util.*;

public class Gcd {
    //  greatest common divisor
    public static int gcd(int First_number, int Second_number) {
        int i = First_number % Second_number;
        while (i != 0) {
            First_number = Second_number;
            Second_number = i;
            i = First_number % Second_number;
        }
        return Second_number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Number  :");
        int num1 = sc.nextInt();
        System.out.print("Second Number :");
        int num2 = sc.nextInt();

        System.out.println("Greatest Common Divisors: " + gcd(num1, num2));

    }
}