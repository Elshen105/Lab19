import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderMethod {

    public static void main(String[] args) {
        searchApplication();


    }


    public static void searchApplication() {
        String[] fullNameArray = null;
        while (true) {

            showMenu();

            int operation = new Scanner(System.in).nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Nece nefer elave etmek isteyirsiniz : ");
                    int fullNameSize = new Scanner(System.in).nextInt();
                    fullNameArray = addFullName(fullNameSize);

                    System.out.println(
                            "--------------------------------------------------\n" +
                                    Arrays.toString(fullNameArray) +
                                    "The name was successfully added to the array" +
                                    "\n--------------------------------------------------"
                    );
                    break;
                case 2:
                    System.out.print("Axtaris edeceyiniz contenti daxil edin : ");
                    String searchContentFromArray = new Scanner(System.in).nextLine();
                    searchContent(fullNameArray, searchContentFromArray);
                    break;

            }

        }
    }

    public static void showMenu() {
        System.out.println("1. Add Full Name");
        System.out.println("2. Search");
    }

    public static String[] addFullName(int fullNameSize) {
        String[] fullNamesArray = new String[fullNameSize];
        for (int i = 0; i < fullNamesArray.length; i ++ ) {
            fullNamesArray[i] = new Scanner(System.in).nextLine();
        }
        return fullNamesArray;
    }



    public static void searchContent(String[] fullNames, String searchContent) {
        for (int i = 0; i < fullNames.length; i ++ ) {
            if (fullNames[i].contains(searchContent)) {
                System.out.println(fullNames[i]);
            }
        }

    }


}
