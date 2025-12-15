package ex_20072024;

import java.util.Scanner;
import java.util.SortedMap;public class Lab088 {
    public static void main(String[] args) {
        //max number in to input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num_1 = sc.nextInt();
        System.out.println(num_1);
        System.out.println("Enter a number 2");
        int num_2 = sc.nextInt();
        System.out.println(num_2);

        System.out.println(Math.max(num_1,num_2));

//        if (num_1 > num_2) {
//            System.out.println(num_1);
//        } else if (num_1 < num_2) {
//            System.out.println(num_2);
//        } else {
//            System.out.println("Equal");
//        }
    }
}
