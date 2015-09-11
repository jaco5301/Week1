import TurtleGraphics.*;
public class Day3 {
    
    public static void main(String[] args) {
        SketchPadWindow win = new SketchPadWindow(600, 400);
        Pen p = new WiggleRainbowPen(win);
        p.setWidth(10);
        int size=100;
        int mover=7;
        p.move(size);
        p.turn(mover);
        p.move(size);
        p.turn(mover);
        p.move(size);
        p.turn(mover);
        p.move(size);
        
        //move over and draw another square bb
        p.up();
        p.move(200);
        p.down();
        p.turn(mover);
         p.move(size);
        p.turn(mover);
        p.move(size);
        p.turn(mover);
        p.move(size);
        p.turn(mover);
        p.move(size);
        
    }
    
}
