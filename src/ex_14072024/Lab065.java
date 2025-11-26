package ex_14072024;

public class Lab065 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // A -> ++a -> EXP -> ++a = 11  -> a = 11
        //+
        // A -> ++a -> EXP -> ++a =  11 -> a = 12
        //+
        // A -> ++a -> EXP -> ++a =  12 -> a = 13
        System.out.println(a);

               }
}
