import java.awt.*;
import java.awt.event.InputEvent;
public class Robot2{
    public static void main (String[]args) throws Exception{

    
        Robot izzy = new Robot ();
        izzy.mouseMove(0,0);
        izzy.mousePress(InputEvent.BUTTON1_DOWN_MASK);
    }
    
}