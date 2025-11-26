package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        // Widening
        byte b = 10;
        int a = b; // VALID - Implicit casting
        int a1 = (int) b; //VALID - Explicit casting
        // Narrowing
        int val = 300;
        //  byte b1 = val;   //InVALID - Implicit casting -> JVM
        byte b1 = (byte) val; ////VALID - Explicit casting
        System.out.println(b1);

    }
}