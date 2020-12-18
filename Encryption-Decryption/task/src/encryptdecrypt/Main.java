package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        char[] input = "we found a treasure!".toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (Character.isAlphabetic(input[i])) {
                input[i] = (char) ('z' - (input[i] - 'a'));
            }
        }
        System.out.println(String.valueOf(input));
    }
}
