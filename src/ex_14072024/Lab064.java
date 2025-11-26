package ex_14072024;

public class Lab064 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        // A = ++a = Exp -> 11   a -> 11
        // +
        // A = ++a =Exp - > 12  a -> 12
        System.out.println(a);
    }
}