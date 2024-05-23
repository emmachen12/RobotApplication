import java.awt.*;
import java.awt.event.InputEvent;
public class Robot2{
    public static void main (String[]args) throws Exception{

    
        Robot izzy = new Robot ();
        izzy.setAutoDelay(100);

        izzy.mouseMove(0,1080);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        izzy.mouseMove (200,920);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        izzy.mouseMove (1230,500);
        izzy.setAutoDelay(900);
        izzy.mouseMove (1231,500);
        izzy.setAutoDelay(1300);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

       
        izzy.mouseMove (1220,850);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        izzy.mouseMove (900,850);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        izzy.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
    
}