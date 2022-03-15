import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class read_content_from_file_using_BufferedReader {
    public static void main(String args[])
    {
        final String fileName="file2.txt";
         
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                System.out.println("File does not exist!!!");
                System.exit(0);
            }
             
            //reading content from file
            String text;
            int val;
         
            FileReader objFR=new FileReader(objFile.getAbsoluteFile());
            BufferedReader objBR=new BufferedReader(objFR);
            //read text from file
            System.out.println("Content of the file is: ");
            while((text=objBR.readLine())!=null)
            {
                System.out.println(text);
            }
             
            objBR.close();          
        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }

}
