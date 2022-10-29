package onboarding;

public class Problem4 {
    public static String solution(String word) {
        return stringConverter(word);
    }

    private static String stringConverter(String target) {
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < target.length(); index++) {
            char result = charConverter(target.charAt(index));
            builder.append(result);
        }
        return String.valueOf(builder);
    }

    private static char charConverter(char target) {
        if (isUppercase(target)) {
            return (char) ('Z' - (target - 'A'));
        } else if (isLowercase(target)) {
            return (char) ('z' - (target - 'a'));
        } else {
            return target;
        }
    }

    private static boolean isUppercase(char target) {
        return 'A' <= target && target <= 'Z';
    }

    private static boolean isLowercase(char target) {
        return 'a' <= target && target <= 'z';
    }
}
