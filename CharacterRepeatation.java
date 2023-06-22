import java.util.HashMap;
import java.util.Map;

public class CharacterRepeatation {
    public static void characterCount(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (ch != ' ') {
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            System.out.print(ch + "-" + count + ", ");
        }
    }

    public static void main(String[] args) {
        String input = "Srikar Reddy";
        characterCount(input);
    }
}