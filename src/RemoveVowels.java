import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Taking input number
        System.out.print("Enter the number of vowels to remove: ");
        int n = scanner.nextInt();
        
        // Convert the string to lowercase
        String lowerCaseString = inputString.toLowerCase();
        
        // Remove n number of vowels
        String resultString = removeNVowels(lowerCaseString, n);
        
        // Print the result
        System.out.println("Modified string: " + resultString);
        
        scanner.close();
    }
    
    private static String removeNVowels(String str, int n) {
        StringBuilder sb = new StringBuilder();
        int vowelsRemoved = 0;
        
        for (char c : str.toCharArray()) {
            if (isVowel(c) && vowelsRemoved < n) {
                vowelsRemoved++;
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
