//Java - Print File Content, Display File using Java Program.
 
import java.io.*;
 
public class Print_File_Content_Display_File{ 
    public static void main(String args[]) throws IOException{
        File fileName = new File("file2.txt"); 
         
        FileInputStream inFile = new FileInputStream("file2.txt");
        int fileLength =(int)fileName.length();
             
        byte Bytes[]=new byte[fileLength];
             
        System.out.println("File size is: " + inFile.read(Bytes));
             
        String file1 = new String(Bytes);
        System.out.println("File content is:\n" + file1);
     
        //close file
        inFile.close();
    }
}