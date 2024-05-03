import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String text = new Scanner(System.in).nextLine();

        String text2 = reverseText(text);

        boolean b = isPalindrome(text, text2);

        if (b) System.out.println("Palindrome");
        else System.out.println("Is not Palindrome");


    }


    public static String reverseText(String text) {
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i --) {
            reverseText += text.charAt(i);
        }
        return reverseText;
    }


    public static boolean isPalindrome(String text1, String text2) {
        return text1.equalsIgnoreCase(text2);
    }


}
