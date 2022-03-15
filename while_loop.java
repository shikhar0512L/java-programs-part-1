//Java program to print numbers from 1 to N

import java.util.Scanner;

public class while_loop {
    public static void main(String args[]) {
        int loop; //declaration of loop counter
        int N;

        Scanner SC = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        N = SC.nextInt();

        loop = 1;
        while (loop <= N) {
            System.out.print(loop + " ");
            loop++;
        }

    }
}