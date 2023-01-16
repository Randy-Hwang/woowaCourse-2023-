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

    private static int count369(String stringify) {
        int howMany = 0;
        for (int i = 0; i < stringify.length(); i++) {
            String eachDigit = String.valueOf(stringify.charAt(i));
            if (check369(eachDigit)) {
                howMany += 1;
            }
        }
        return howMany;
    }

    private static boolean check369(String digits) {
        return digits.equals("3") || digits.equals("6") || digits.equals("9");
    }
}
