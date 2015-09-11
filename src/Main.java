import hsa.*;
public class Main {

    
    public static void main(String[] args) {
        Console c=new Console();
        c.print("Hi");
        int age;
        c.print("\nHow old are you ;)");
        age=c.readInt();
        age++;
        c.print("You will be" + age + " next year!");
    }
    
}
