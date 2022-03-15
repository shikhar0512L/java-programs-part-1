import java.io.File;
import java.io.FileInputStream;

public class read_content_from_file_using_FileInputStream {
    public static void main(String args[])
    {
        final String fileName="yo.txt";
         
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
         
            //object of FileOutputStream
            FileInputStream fileIn=new FileInputStream(objFile);
            //read text from file
            System.out.println("Content of the file is: ");
            while((val=fileIn.read())!=-1)
            {
                System.out.print((char)val);
            }   
             
            System.out.println();   
             
            fileIn.close();         
        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }

}
