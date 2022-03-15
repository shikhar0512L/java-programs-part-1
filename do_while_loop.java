//Java program to print numbers from 1 to N

import java.util.Scanner;

public class do_while_loop {
    public static void main(String args[]) {
        int loop; //declaration of loop counter
        int N;

        Scanner SC = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        N = SC.nextInt();

        loop = 1;
        do {
            System.out.print(loop + " ");
            loop++;
        } while (loop <= N);

    }
}