package encryptdecrypt;

import java.util.Scanner;

public class Main {
    private static final int SIZE = 26;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] message = scanner.nextLine().toCharArray();
        int key = scanner.nextInt();
        for (int i = 0; i < message.length; i++) {
            if (Character.isAlphabetic(message[i])) {
                message[i] = (char) ('a' + (message[i] - 'a' + key) % SIZE);
            }
        }
        System.out.println(String.valueOf(message));
    }

    public static void stageOne() {
        char[] input = "we found a treasure!".toCharArray();
        for (int i = 0; i < input.length; i++) {
            if (Character.isAlphabetic(input[i])) {
                input[i] = (char) ('z' - (input[i] - 'a'));
            }
        }
        System.out.println(String.valueOf(input));
    }
}
