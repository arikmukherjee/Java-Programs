import java.awt.*;
import java.applet.*;
public class LifeCycle extends Applet
{	
   String msg;	
   public void init()	
    {	 
       setBackground(Color.cyan);	 	
       msg="----inside init method----";
    }
  public void start()	
  {	
     msg+="inside start method";	
  }	
  public void paint(Graphics g)	
  {	 msg+="  inside paint method  ";	
       g.drawString(msg,10,30);
   }
}
