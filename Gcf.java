import java.util.Scanner;

public class Gcf {
        //  greatest common factor
        public static int hcf(int First_number, int Second_number) {
            int hcf = 0;
            int min = Math.min(First_number, Second_number);
    
            for (int i = min; i >= 1; i--) {
                if (First_number % i == 0 && Second_number % i == 0) {
                    hcf = i;
                    break;
                }
            }
            return hcf;
        }
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
    
            System.out.print("First Number  :");
            int num1 = sc.nextInt();
            System.out.print("Second Number :");
            int num2 = sc.nextInt();
    
            System.out.println("Highest Common Factor: " + hcf(num1, num2));
    
        }
    
}
