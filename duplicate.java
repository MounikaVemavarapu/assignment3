import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);

        System.out.println("Original string: " + input);
        System.out.println("After removing duplicates: " + output);
    }
}
