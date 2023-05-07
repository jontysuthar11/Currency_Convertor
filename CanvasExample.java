import java.awt.*;
public class CanvasExample {
    public CanvasExample()
    {
        Frame f = new Frame("Canvas Example");
        f.add(new MyCanvas());
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new CanvasExample();
    }
}
