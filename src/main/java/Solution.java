public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/
    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length() < 2) {
            return false;
        }
        return x.endsWith("ly");
    }

    public String conCat(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return s1 + s2;
        }
        
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        }
        
        return s1 + s2;
    }

    public String withoutX(String s1) {
        if (s1.startsWith("x")) {
            s1 = s1.substring(1);
        }
        
        if (s1.endsWith("x")) {
            s1 = s1.substring(0, s1.length() - 1);
        }
        
        return s1;
    }

    public String fizzString(String s1) {
        boolean startsWithF = s1.startsWith("f");
        boolean endsWithB = s1.endsWith("b");
        
        if (startsWithF && endsWithB) {
            return "FizzBuzz";
        }
        if (startsWithF) {
            return "Fizz";
        }
        if (endsWithB) {
            return "Buzz";
        }
        
        return s1;
    }

    public String fizzString2(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz!";
        }
        if (x % 3 == 0) {
            return "Fizz!";
        }
        if (x % 5 == 0) {
            return "Buzz!";
        }
        
        return x + "!";
    }
}
