package MainPackage;
import java.applet.Applet;
import java.awt.Graphics;
/**
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.applet.Applet;
import java.awt.*;
public class appletclass2 extends Applet
{
 Label MyLabel = new Label("Enter Username");
 TextField MyTextBox = new TextField();
  public void init()
  {
      add(MyLabel);
      add(MyTextBox);
 }
}
*/
public class appletclass2 extends Applet
{
    @Override
	public void paint(Graphics g)
    {    
       g.drawString("Hello World", 100, 100);    
    }
}
