import java.applet.Applet;
import java.awt.*;

/**
 * Created by hankaibo on 2017-11-6.
 */
public class Java extends Applet{
    String hwText;
    public void init(){
        hwText="hello world";
    }
    public void paint(Graphics g){
        g.drawString(hwText,25,25);
    }
}
