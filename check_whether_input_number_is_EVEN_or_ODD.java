import java.util.*;

public class check_whether_input_number_is_EVEN_or_ODD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;

        //inpu
        System.out.print("Enter an integer number: ");
        num = sc.nextInt();

        //check EVEN or ODD
        if (num % 2 == 0) {
            System.out.println(num + " is an EVEN number.");
        } else {
            System.out.println(num + " is an ODD number.");
        }
    }

}
