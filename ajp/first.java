
//  this is the example of awt (inheritance)
import java.awt.*;

class first extends frame {
    first() {
        Button b = new Button("Click me");
        b.setBounds(30, 100, 80, 30); // setting button position
        add(b); // adding button into the frame

        setSize(300, 300); // frame size 300 width and 300 height
        setLayout(null);
        SetVisible(true); // we have done this bcoz now frame will visible
                          // becoz by default frame will not visible;
    }

    public static void main(String args[]) {
        First f = new First();
    }
}
