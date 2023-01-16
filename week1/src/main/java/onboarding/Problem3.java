package onboarding;

public class Problem3 {
    /**
     * if 1 <= number <= 10000, int number would be turned into String.
     * After, check369 function will be called.
     * check369 will return how many 369s in number.
     * This would be the answer.
     * @param number that should be checked how many claps needed.
     * @return the number of claps that should have done.
     */
    public static int solution(int number) {
        int answer;
        if (number < 1 || number > 10000) {
            System.out.println("The number should be in range of 1 to 10000");
            answer = -1;
        } else {
            String stringNumber = Integer.toString(number);
            answer = check369(stringNumber);
        }
        return answer;
    }

    /**
     * @param number that stringified int number.
     * @return how many 369s in the number.
     */
    private static int check369(String number) {
        int howMany = 0;

        return howMany;
    }
}
