package DSA.Basic;

public class Main {
    public static void main(String[] args) {
     Counter c;
     c = new Counter();
     c.increment();
     c.increment(3);
     System.out.println(c.getCount()); 
    
     Modifiers m;
     m = new Modifiers();
     System.out.println(Modifiers.data + m.getCount());

     StringBuilder s = new StringBuilder("1234");
     System.out.println(s);

    } 
}
