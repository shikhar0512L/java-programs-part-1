//java program to convert decimal to binary
import java.util.*;
 
public class Decimal_to_Binary
{
    public static void main(String args[])
    {
        int num,counter=0;
        Scanner sc =new Scanner(System.in);
     
        System.out.print("Enter any integer number: ");
        num = sc.nextInt();
     
        //to store maximum 32 bits of a number
        int binaryVal[] = new int[32];
     
        while(num > 0){
            binaryVal[counter++] = num%2;
            num = num/2;
        }
     
        /*print binary values stored in binaryVal*/
        for(int i = counter-1;i >= 0;i--){
            System.out.print(binaryVal[i]);
        }
    }
}