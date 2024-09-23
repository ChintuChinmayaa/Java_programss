package All_Practice_JavaProgram;

public class TestCases_2 {
    public static void main(String[] args) {
        String name = "chinmaya"; // The string to check
        String vowels = "aeiou";  // String containing all vowels
        int count = 0;            // Counter for the number of vowels

        // Loop through each character in the name
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i); // Get the character at index i
            // Check if the character is a vowel
            if (vowels.indexOf(ch) != -1) {
                System.out.println("Vowel found: " + ch);
                count++; // Increment the counter
            }
        }

        // Print the total number of vowels found
        System.out.println("Total number of vowels: " + count);
    }
}

