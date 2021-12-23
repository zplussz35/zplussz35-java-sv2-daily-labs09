package day03;

public class Caesar extends Encryption{
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c:input.toCharArray()) {
            sb.append((char)(c+offset));
        }
        return sb.toString();
    }
}
