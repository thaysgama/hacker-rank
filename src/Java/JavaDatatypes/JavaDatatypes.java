package Java.JavaDatatypes;

import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        Integer a = Integer.MAX_VALUE;

        for(int i=0; i<t ; i++){
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
//                A byte is an 8-bit signed integer.
                if(x>=-128 && x<=127)System.out.println("* byte");
//                A short is a 16-bit signed integer.
//                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                if(x>=-32768 && x<=32767)System.out.println("* short");
//                An int is a 32-bit signed integer.
//                if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                if(x>= -2147483648 && x<=2147483647)System.out.println("* int");
//                A long is a 64-bit signed integer
//                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
            }

            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
