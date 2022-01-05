package Java.JavaStringReverse;

import java.util.Scanner;

public class JavaStringReverseOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        StringBuilder input = new StringBuilder();
        input.append(A).reverse();
        if (A.contentEquals(input)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
