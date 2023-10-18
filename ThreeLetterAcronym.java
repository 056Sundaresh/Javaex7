import java.util.Scanner;

public class ThreeLetterAcronym{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter three words to generate a three-letter acronym:");
            String userInput = input.nextLine();
            String[] words = userInput.split(" "); 
            StringBuilder acronym = new StringBuilder();
            for (int i = 0; i < Math.min(3, words.length); i++) {
                if (!words[i].isEmpty()) { 
                    acronym.append(words[i].charAt(0));
                }
            }
           
            String acronymResult = acronym.toString().toUpperCase(); 
            System.out.println("Three-Letter Acronym: " + acronymResult);
        }
    }
}
