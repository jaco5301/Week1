import TerminalIO.*;
public class Day2 {
     
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        int age;
        age=r.readInt("How old are you ;D");
        age++;
        System.out.println("In one year you will be" + age);
                
    }
    
}
