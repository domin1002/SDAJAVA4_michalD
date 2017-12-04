import java.util.regex.Pattern;

public class PhoneNumber {
    private String phoneNr;

    public PhoneNumber(String phone) {
        if (Pattern.compile("[^0-9()\\s-.]").matcher(phone).find()) throw
                new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");

        String nr = phone.replaceAll("[^0-9]", "");

        if (nr.length() > 11 || nr.length() < 10) throw
                new IllegalArgumentException("Number must be 10 or 11 digits");
        if (nr.charAt(0) != '1') throw
                new IllegalArgumentException("Can only have 11 digits if number starts with '1'");

        this.phoneNr = nr;
    }

    public String getNumber() {
        if (phoneNr.length() > 10) return phoneNr.substring(phoneNr.length() - 10, phoneNr.length());
        else return phoneNr;
    }
}
