import java.io.File;

public class delete_a_file {
    public static void main(String args[])
    {
        final String fileName="fileName.txt";
         
        //File class object
        File objFile=new File(fileName);
         
        //check file is exist or not, if exist delete it
        if(objFile.exists()==true)
        {
            //file exists
            //deleting the file
            if(objFile.delete())
            {
                System.out.println(objFile.getName() + " deleted successfully.");
            }
            else
            {
                System.out.println("File deletion failed!!!");
            }
        }
        else
        {
            System.out.println("File does not exist!!!");
        }
    }

}
