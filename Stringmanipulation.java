import java.util.Scanner;

public class Stringmanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        
        System.out.println("Length of first string: " + str1.length());

        
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + combined);

        
        if (str1.length() >= 3) {
            System.out.println("Substring (first 3 chars): " + str1.substring(0, 3));
        }

        
        String replaced = str1.replace('a', '@');
        System.out.println("After Replace: " + replaced);

        
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed String: " + reversed);

       
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        sc.close();
    }
}

