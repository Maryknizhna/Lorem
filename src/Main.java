import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    protected static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        HashMap<Character, Integer> textLetter = new HashMap<>();
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            
            Character textChar = text.charAt(i);
            if (Character.isLetter(textChar)) {
                if (textLetter.containsKey(textChar)) {
                    Integer value = textLetter.get(textChar);
                    textLetter.put(textChar, value + 1);
                } else {
                    textLetter.put(textChar, 1);
                }
            }
        }

        System.out.println("Самая часто встречающаяся буква - " + "\"" + Collections.max(textLetter.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey() + "\"" + ", она встречается " + Collections.max(textLetter.values()) + " раз(а).");
        System.out.println("Наименее встречающаяся буква - " + "\"" + Collections.min(textLetter.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey() + "\"" + ", она встречается " + Collections.min(textLetter.values()) + " раз(а).");

    }
}
