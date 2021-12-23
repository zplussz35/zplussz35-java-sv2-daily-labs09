package day03;

import java.util.Locale;

public class Caesar extends Encryption {
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        String input2 = input.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : input2.toCharArray()) {
            if (c <= 'z' && c >= 'a') {
                sb.append((char) (c + offset));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
