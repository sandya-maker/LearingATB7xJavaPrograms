package ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing academy"; // SCP
        String name1 = "The Testing academy"; // SCP


        String name2 = new String("The Testing academy"); // Heap area
//        String name3= new String("The Testing academy");  // Heap area

        System.out.println(name == name1); // check for the ref
        System.out.println(name.equals(name1)); // check for the content

        System.out.println(name1 == name2);  // check for the ref
        System.out.println( name1.equals(name2)); // check for the content


    }
}
