import java.util.*;

public class find_largest_number_among_three_numbers {
    public static void main(String[] s) {
        int a, b, c, largest;
        //Scanner class to read value
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first  number:");
        a = sc.nextInt();
        System.out.print("Enter second number:");
        b = sc.nextInt();
        System.out.print("Enter third  number:");
        c = sc.nextInt();

        if (a > b && a > c)
            largest = a;
        else if (b > a && b > c)
            largest = b;
        else
            largest = c;

        System.out.println("Largest Number is : " + largest);

    }

}