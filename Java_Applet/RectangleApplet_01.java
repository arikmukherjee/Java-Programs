import java.awt.*;
import java.applet.*;

public class RectangleApplet_01 extends Applet{
    public void paint(Graphics g){
        g.drawRect(10, 20, 30, 40);
        g.fillRect(10, 20, 30, 40);
        g.fillRoundRect(100, 200, 300, 400, 500, 600);
        g.drawOval(250, 120, 45, 12);
    }
}