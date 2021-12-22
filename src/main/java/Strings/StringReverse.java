package Strings;

public class StringReverse {

    public static String reversStringUsingCharArray(String input) {
        char[] result = new char[input.length()];
        for (int i = input.length() - 1, index = 0; i > -1; i--, index++) {
            result[index] = input.charAt(i);
        }
        return String.valueOf(result);
    }

    public static String reverseStringUsingStringBuilder(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = charArray.length - 1; i > -1; i--) {
            sb.append(charArray[i]);
        }
        return sb.toString();
    }

    public static String reverseSentenceUsingExtraSpace(String input) {
        String stringArray[] = input.
                split(" ");
        String result = "";
        for (int i = stringArray.length - 1; i >= 0; i--) {
            result += stringArray[i] + " ";
        }
        return result.trim();
    }

    public static String reverseSentenceWithoutUsingExtraSpace(String input) {
        return null;
    }
}
