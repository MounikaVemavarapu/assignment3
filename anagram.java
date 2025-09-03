import java.util.Arrays;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all whitespaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String string1 = "Listen";
        String string2 = "Silent";

        if (areAnagrams(string1, string2)) {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
        }
    }
}
