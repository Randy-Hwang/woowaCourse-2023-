package onboarding;

import java.util.ArrayList;

public class Problem4 {

    /**
     * This method will make inputs into another sentence
     * by following specific rules that explained in problem.
     * Put the "word" arguments into ArrayList.
     * This ArrayList would be the parameter of changeWord method.
     * changeWord method would return the answer.
     * @param word that should be turned into other word.
     * @return the sentence made based on the parameter "word"
     */
    public static String solution(String word) {
        String answer;
        String[] splitSentences = word.split(" ");

        ArrayList<Integer> splitedList = new ArrayList<>();
        ArrayList<String> sumOfChanged = new ArrayList<>();

        for (String words : splitSentences) {
            splitedList.clear();
            for (int i = 0; i < words.length(); i++) {
                int c = words.charAt(i); // Get ASCII code changing char to int
                splitedList.add(c);
            }
            String changedWord = changeWord(splitedList);
            sumOfChanged.add(changedWord);
        }

        StringBuilder sb = new StringBuilder();
        for (String words : sumOfChanged) {
            sb.append(words);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1); // Delete last spacing
        answer = sb.toString();

        return answer;
    }

    /**
     * First, this method will distinguish between uppercase and lowercase.
     * Based on ASCII code, each alphabet's ASCII code differs at most 25.
     * This method will find how far the target letter is from the a(or A).
     * A's ASCII code is 65. If the target letter is E, whose ASCII code is 69.
     * Distance between A and E is 4.
     * This method will subtract 4 from 90(because it's Z's ASCII code).
     * Then E would be changed into V.
     * @param wordList The given word changed into ArrayList.
     * @return the String changed into specific rules explained in the problem.
     */
    private static String changeWord(ArrayList<Integer> wordList) {
        String answer;
        ArrayList<Integer> changedASCII = new ArrayList<>();
        for (Integer beforeASCII : wordList) {
            if (beforeASCII > 64 && beforeASCII < 91) { // When alphabet is uppercase.
                int difference = beforeASCII - 65;
                changedASCII.add(90 - difference);
            } else if (beforeASCII > 96 && beforeASCII < 123) { // When alphabet is lowercase.
                int difference = beforeASCII - 97;
                changedASCII.add(122 - difference);
            } else {
                System.out.println("There is something that not an alphabet. Try Again.");
            }
        }

        ArrayList<String> answerASCII = new ArrayList<>();
        for (Integer beforeASCII : changedASCII) {
            String c = Character.toString(beforeASCII);
            answerASCII.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (String chars : answerASCII) {
            sb.append(chars);
        }
        answer = sb.toString();

        return answer;
    }
}
