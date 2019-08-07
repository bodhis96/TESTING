package MainPackage;
import java.applet.Applet;
import java.awt.Graphics;
public class appletclass extends Applet
{
    @Override
	public void paint(Graphics g)
    {    
       g.drawString("Hello World", 100, 100);    
    }
}