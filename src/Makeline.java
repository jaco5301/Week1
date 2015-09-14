import TurtleGraphics.*;
import hsa.*;
public class Makeline {
    public static void main(String[] args) {
        SketchPadWindow s = new SketchPadWindow(400, 400);
        StandardPen p =new StandardPen(s);
        Console c = new Console();
        int x1, x2, y1, y2;
        c.print("Enter X1: ");
        x1 = c.readInt();
        c.print("Enter Y1: ");
        y1 = c.readInt();
        c.print("Enter X2: ");
        x2 = c.readInt();
        c.print("Enter Y2: ");
        y2 = c.readInt();
        p.up();
        p.move(x1-200,y1-200);
        p.down();
        p.drawString("(" + y1 + ", " + x1 + ")");
        p.move(y1-200,y2-200);
        p.drawString("(" + y2 + ", " + x1 + ")");
        
    }
    
}
