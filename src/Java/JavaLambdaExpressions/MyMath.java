package Java.JavaLambdaExpressions;

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd(){
        return a -> !(a%2==0);
    }

    public PerformOperation isPrime(){
        return a -> {
                boolean result = false;
                for (int i = 2; i < a; i++) {
                    result = a%i == 0;
                    if(result)
                        break;
                }
                return !result;
        };
    }
    public PerformOperation isPalindrome(){
        return a-> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }
}
