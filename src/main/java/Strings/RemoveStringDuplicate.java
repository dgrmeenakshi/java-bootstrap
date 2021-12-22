package Strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveStringDuplicate {

    public static Map<Character, Integer> countNumberOfCharsInString(String input) {
        if (input == null || input.isEmpty() || isAlphanumeric(input))
            throw new IllegalArgumentException("Value can't be empty");

        Map<Character, Integer> countByChar = new HashMap<>();
        char[] characters = input.toCharArray();

        for (char character : characters)
            if (countByChar.containsKey(character))
                countByChar.put(character, countByChar.get(character) + 1);
            else
                countByChar.put(character, 1);

        return countByChar;
    }

    private static boolean isAlphanumeric(String input) {
        return input != null && input.matches("^[a-zA-Z0-9]*$");
    }

}
