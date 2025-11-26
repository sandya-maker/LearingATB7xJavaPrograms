package ex_14072024;

public class Lab063 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);

        // A = a++  -> exp 10 , a = 11
        // +
        // B = ++a   -> exp 12 , a = 12
    }
}
