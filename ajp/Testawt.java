import java.awt.*;
public class Testawt
{
    Testawt() // constructor
    {
        Frame fm = new Frame();
        Label lb = new Label("Welcome to java grahpics");
        
        fm.add(lb);  // adding a label to the frame
        fm.setSize(300,300);
        fm.setVisible(true);
    }
    public static void main(String args[])
    {
        Testawt ta = new Testawt();
    }
}
