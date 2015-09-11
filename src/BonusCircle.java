import TurtleGraphics.*;
public class BonusCircle {
    public static void main(String[] args) {
        SketchPadWindow win = new SketchPadWindow(600, 400);
        Pen p = new WiggleRainbowPen(win);
        p.setWidth(10);
        int size=10;
        int mover=7;
        for(int count=0; count<360; count++)
        {
            p.move(size);
        p.turn(mover);
        }
        
        //move over and draw another square bb
   
        
    }
    
}
