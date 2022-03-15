import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
 
public class ExBufferedWriter
{
    public static void main(String args[])
    {
        final String fileName="file2.txt";
         
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                if(objFile.createNewFile())
                {
                    System.out.println("File created successfully.");
                }
                else
                {
                    System.out.println("File creation failed!!!");
                    System.exit(0);
                }
            }
             
            //writting data into file
            String text;
            Scanner SC=new Scanner(System.in);
             
            System.out.println("Enter text to write into file: ");
            text= SC.nextLine();
             
            //instance of FileWriter 
            FileWriter objFileWriter = new FileWriter(objFile.getAbsoluteFile());
            //instnace (object) of BufferedReader with respect of FileWriter
            BufferedWriter objBW = new BufferedWriter(objFileWriter);
            //write into file
            objBW.write(text);
            objBW.close();
             
            System.out.println("File saved.");
        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }
}