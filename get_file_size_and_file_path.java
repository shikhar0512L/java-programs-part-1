import java.io.File;

public class get_file_size_and_file_path {
    public static void main(String args[])
    {
        final String fileName="yo.txt";
        try
        {
            //File Object
            File objFile=new File(fileName);
             
            //getting file path
            System.out.println("File path is: " + objFile.getAbsolutePath());
            //getting filesize
            System.out.println("File size is: " + objFile.length() + " bytes.");
        }
        catch (Exception Ex)
        {
            System.out.println("Exception: "+ Ex.toString());
        }
         
    }

}
