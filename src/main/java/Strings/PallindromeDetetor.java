package Strings;

public class PallindromeDetetor {

    public static boolean IsPallindrome(String word) {
        if (Reverse(word).equals(word)) {
            System.out.println(word + " is a Pallindrome");
            return true;
        } else {
            System.out.println(word + " is not a Pallindrome");
            return false;
        }

    }


    private static boolean IsPallindrome(int i) {
        if (Reverse(i) == i) {
            System.out.println(i + " is a Pallindrom");
            return true;
        } else {
            System.out.println(i + " is not a Pallindrom");
            return false;
        }
    }

    private static int Reverse(int num) {
        int mod = 0;
        String result = "";
        while (num > 0) {
            mod = num % 10;
            num = num / 10;
            result = result + mod;
        }
        return Integer.parseInt(result);
    }

    private static String Reverse(String input) {
        char[] result = new char[input.length()];
        for (int i = input.length() - 1, index = 0; i > -1; i--, index++) {
            result[index] = input.charAt(i);
        }
        return String.valueOf(result);
    }

}
