import java.awt.Dimension;
import java.awt.Toolkit;


public class Screen_Resolution {
    static String getResolution(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        short width  = (short)screenSize.getWidth();
        short height = (short)screenSize.getHeight();
        
        String resolution = width+" X "+height;
        return resolution;
    }
    
    public static void main(String[] args) {
        System.out.println("Screen Resolution : "+getResolution());
    }

}
