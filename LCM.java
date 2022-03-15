import java.util.Scanner;

public class LCM {
        //  Lowest common Number
        public static int lcm(int First_number, int Second_number) {
            int x, max = 0, min = 0, lcm = 0;
            if (First_number > Second_number) {
                max = First_number;
                min = Second_number;
            } else {
                max = Second_number;
                min = First_number;
            }
    
            for (int i = 1; i <= min; i++) {
                x = max * i;
                if (x % min == 0) {
                    lcm = x;
                    break;
                }
            }
            return lcm;
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.print("First Number  :");
            int num1 = sc.nextInt();
            System.out.print("Second Number :");
            int num2 = sc.nextInt();
    
            System.out.println("Lowest Common Factor: " + lcm(num1, num2));
    
        }
    
}
