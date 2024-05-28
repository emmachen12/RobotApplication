import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File; 


import java.awt.event.InputEvent;
public class Robot2{
    public static void main (String[]args) throws Exception{

    
        Robot izzy = new Robot ();
        izzy.setAutoDelay(100);

        izzy.mouseMove(0,1080);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        izzy.mouseMove (200,735);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        izzy.mouseMove (1230,500);
        izzy.setAutoDelay(1200);
        izzy.mouseMove (1231,500);
        izzy.setAutoDelay(1300);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

       
        izzy.mouseMove (1220,850);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        izzy.mouseMove (800,150);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        izzy.mouseMove (800,260);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= izzy.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png" );
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to" + file.getPath()); 


    }
    
}