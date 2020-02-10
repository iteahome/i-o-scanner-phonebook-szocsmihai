import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * By using Scanner, find the phone number of a specific name.
 * PhoneBook is persisted in the "phonebook.txt".
 * Example:
 * Input: Marius
 * Output: 0313221222
 */

public class PhoneBookScanner {

//  Method to find a phone number through a contact's name (or partial name):
    public static String findNumber(String name) {

//      Acquiring the phone number of the contact via their name:
        String contact;
        String phoneNo = "Sorry, that person is not in the phone book.";
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("./src/main/resources/phonebook.txt"));
            Pattern pattern = Pattern.compile(name);
            while ((contact = fileReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(contact);
                if (matcher.find()) {
                    String[] contactInfo = contact.split("\\s+(?=\\d)");
                    phoneNo = contactInfo[1];
                    return phoneNo;
                }
            }
            fileReader.close();

//      If text file cannot be read:
        } catch (IOException e) {
            e.printStackTrace();
        }

//      Method's end result:
        return phoneNo;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Who's number are you looking for?");
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("The phone number is:\n" + PhoneBookScanner.findNumber(keyboardScanner.nextLine()));

    }
}