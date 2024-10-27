package randomPassword;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_SYMBOLS = "!@#$%^&*()-_+=<>?";
    private static final String ALL_SYMBOLS = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_SYMBOLS;
    private final SecureRandom random;

    public PasswordGenerator() {
        this.random = new SecureRandom();
    }

    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            password.append(ALL_SYMBOLS.charAt(random.nextInt(ALL_SYMBOLS.length())));
        }
        return mixPassword(password.toString());
    }

    private String mixPassword(String input) {
        StringBuilder inputBuilder = new StringBuilder(input);
        StringBuilder result = new StringBuilder(input.length());

        while (!inputBuilder.isEmpty()) {
            int index = random.nextInt(inputBuilder.length());
            result.append(inputBuilder.charAt(index));
            inputBuilder.deleteCharAt(index);
        }
        return result.toString();
    }
}
