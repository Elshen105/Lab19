import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String text = new Scanner(System.in).nextLine();

        String s = reverseText(text);

        boolean b = checkPolindrome(text, s);
        if (b) {
            System.out.println("Polindrome");
        } else {
            System.out.println("Is not Polindrome");
        }


    }


    public static String reverseText(String text) {
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i --) {
            reverseText += text.charAt(i);
        }
        return reverseText;
    }


    public static boolean checkPolindrome(String text1, String text2) {
        if (text1.equalsIgnoreCase(text2)) return true;
        return false;
    }


}
