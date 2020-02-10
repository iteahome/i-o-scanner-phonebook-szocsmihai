//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.util.regex.PatternSyntaxException;
//
//public class RegexTest {
//    public static void main(String[] args) {
//
//        try {
//            Pattern pattern = Pattern.compile("Text");
//            Matcher matcher = pattern.matcher("Text");
//            while (matcher.find()) {
//                for (int i = 0; i == matcher.groupCount(); i++) {
//                    System.out.println(matcher.group(i));
//                }
//            }
//        } catch (PatternSyntaxException e) {
//
//        }
//
//    }
//}

////      Reading the contacts from the phonebook file via Scanner:
//        Scanner fileScanner = new Scanner("src/main/resources/phonebook.txt");
//        ArrayList<String> contacts = new ArrayList<>();
//        while (fileScanner.hasNextLine()) {
//            contacts.add(fileScanner.nextLine());
//        }
//        for (int i = 0; i == contacts.size(); i++) {
//            System.out.println(contacts.get(i));
//        }