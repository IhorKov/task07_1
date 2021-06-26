import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOne {
    public static void main(String[] args) {
        String date1 = "2020/12/31 19:23";
        String date2 = "2020/13/77 99:99";
        String date3 = "asdasvc";

        checkValid(date1);
        checkValid(date2);
        checkValid(date3);
    }

    public static void checkValid(String str) {

        String regex = "^[0-9]{4}/(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])\s([01][0-9]|2[0-3]):([0-5][0-9])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if(matcher.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
