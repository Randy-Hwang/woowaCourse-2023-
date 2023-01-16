package onboarding;

import java.util.ArrayList;

public class Problem3 {
    /**
     * if 1 <= number <= 10000, the number would be stringified and
     * check369 function will be called.
     * check369 will return how many 369s in each number.
     * the sum of This would be the answer.
     * @param number that should be checked how many claps needed.
     * @return the number of claps that should have done.
     */
    public static int solution(int number) {
        int answer;
        if (number < 1 || number > 10000) {
            System.out.println("The number should be in range of 1 to 10000");
            answer = -1;
        } else {
            int howMany = 0;
            for (int i = 1; i <= number; i++) {
                String stringify = Integer.toString(i);
                howMany += count369(stringify);
            }
            answer = howMany;
        }
        return answer;
    }

    /**
     * Counting from 1 to the target number,
     * this function make numbers to string of each digits.
     * After, check369 function called.
     * If 369 exists, raise howMany variable.
     * @param stringify stringified number.
     * @return the number of 369s when counting from 1 to the number.
     */
    private static int count369(String stringify) {
        int howMany = 0;
        if (stringify.length() == 1) {
            if (check369(stringify)) {
                howMany += 1;
            }
        } else if (stringify.length() == 2) {
            String tensDigit = String.valueOf(stringify.charAt(0));
            String onesDigit = String.valueOf(stringify.charAt(1));
            if (check369(tensDigit)) {
                howMany += 1;
            }
            if (check369(onesDigit)) {
                howMany += 1;
            }
        } else if (stringify.length() == 3) {
            String hundredsDigit = String.valueOf(stringify.charAt(0));
            String tensDigit = String.valueOf(stringify.charAt(1));
            String onesDigit = String.valueOf(stringify.charAt(2));
            if (check369(hundredsDigit)) {
                howMany += 1;
            }
            if (check369(tensDigit)) {
                howMany += 1;
            }
            if (check369(onesDigit)) {
                howMany += 1;
            }
        } else {
            String thousandsDigit = String.valueOf(stringify.charAt(0));
            String hundredsDigit = String.valueOf(stringify.charAt(1));
            String tensDigit = String.valueOf(stringify.charAt(2));
            String onesDigit = String.valueOf(stringify.charAt(3));
            if (check369(thousandsDigit)) {
                howMany += 1;
            }
            if (check369(hundredsDigit)) {
                howMany += 1;
            }
            if (check369(tensDigit)) {
                howMany += 1;
            }
            if (check369(onesDigit)) {
                howMany += 1;
            }
        }
        return howMany;
    }

    private static boolean check369(String digits) {
        return digits.equals("3") || digits.equals("6") || digits.equals("9");
    }
}
