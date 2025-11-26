package ex_14072024;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("Sandesh");
        String s2 = new String("Sandesh");
        String s3 = new String("Sandesh");

        System.out.println(s1 == s2);   // check the ref
        System.out.println(s2 == s3);   // check the ref
        System.out.println(s1.equals(s2));  // check the content


    }
}
