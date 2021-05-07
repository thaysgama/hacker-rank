package Java.JavaSubstringComparisons;

import java.util.*;

public class JavaSubstringComparisonsOne {

    public static String getSmallestAndLargest(String s, int k) {

        java.util.SortedSet<String> set = new java.util.TreeSet();

        for (int i = 0; i <= s.length()-k; i++) {
            set.add(s.substring(i,i+k));
        }

        String smallest = set.first();
        String largest = set.last();

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));



    }
}
