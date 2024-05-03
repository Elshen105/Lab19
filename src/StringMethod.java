import java.util.Scanner;

public class StringMethod {

    public static void main(String[] args) {
        changeAsciiWord("hHHHHHHHHHHHHHHHHee");

    }


    public static void stringMethods() {
        String text = new Scanner(System.in).nextLine();
        String text2 = new Scanner(System.in).nextLine();
        System.out.println("length : " + text.length());
        System.out.println("empty : " + text.isEmpty());
        System.out.println("Upper Case : " + text.toUpperCase());
        System.out.println("Lower Case : " + text.toLowerCase());
        System.out.println("Contains : " + text.contains("Merhaba"));
        System.out.println("Substring : " + text.substring(0, text.length() - 5));
        System.out.println("Substring : " + text.substring(text.length() / 2, text.length() - 2));
        System.out.println("Concat : " + text.concat(text2));
        System.out.println("Replace : " + text.replace('a', 'e'));
    }


    public static void reverseText(String text) {
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText += text.charAt(i);
        }
        System.out.println(reverseText);
    }


    public static void splitText(String text) {
        String[] split = text.split("");
        for (String s : split) System.out.println(s);
    }


    public static void changeAsciiWord(String text) {

        int[] textToNumbersArray = new int[text.length()];

        for (int i = 0; i < text.length(); i++) {
            textToNumbersArray[i] = text.charAt(i);
        }





        int useCount = 0;
        int mostUseCount = 0;

        for (int i = 0; i < textToNumbersArray.length; i++) {
            int repeatCount = 0;
            for (int j = 0; j < textToNumbersArray.length; j++) {
                if (textToNumbersArray[j] == textToNumbersArray[i]) {
                    repeatCount++;
                }
            }


            if (repeatCount > mostUseCount) {
                useCount = textToNumbersArray[i];
                mostUseCount = repeatCount;
            }

        }
        System.out.println("En cok istifade olunan : " + (char) useCount);

    }

}
