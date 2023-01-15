package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    /**
     * 매개변수로 받은 cryptogram을 list로 변환한다.
     * checkDuplication 메서드를 활용해 중복이 있는지 검사하고,
     * removeDuplication 메서드를 활용해 중복 제거를 반복한다.
     * -1을 리턴할 경우 list를 string으로 바꾸어 answer에 대입한다.
     * @param cryptogram to decipher
     * @return answer String using functions.
     */
    public static String solution(String cryptogram) {
        StringBuilder answer = new StringBuilder();
        List<Character> answerList;

        List<Character> listCryptogram = new ArrayList<>();
        for (int i = 0; i < cryptogram.length(); i++) {
            String lowerCryptogram = cryptogram.toLowerCase(); // change to lowercase
            listCryptogram.add(lowerCryptogram.charAt(i));
        }

        while (checkDuplication(listCryptogram) != -1) {
            int startIndex = checkDuplication(listCryptogram);
            removeDuplication(listCryptogram, startIndex);
        }
        answerList = listCryptogram;

        if (!answerList.isEmpty()) {
            for (Character listChar : answerList) {
                answer.append(listChar);
            }
        }

        return answer.toString();
    }

    /**
     * This method will check whether any duplications exist or not.
     * If duplication is not founded, return the index starts duplication.
     * If duplication is founded, return 0.
     * @param cryptogram The list that will check duplication.
     * @return result int value that any duplication is exist or not.
     */
    private static int checkDuplication(List<Character> cryptogram) {
        int startIndex = -1;
        for (int i = 1; i < cryptogram.size() ; i++) {
            int isDuplicateIndex = 0;
            Character currChar = cryptogram.get(i);
            Character prevChar = cryptogram.get(i - 1);
            if (currChar.equals(prevChar)) {
                startIndex = i - 1;
                isDuplicateIndex = i;
            }
            /* if duplication founded, finish for loop to make function more effective. */
            if (isDuplicateIndex != 0) {
                break;
            }
        }

        return startIndex;
    }

    /**
     * This method removes duplication based on startIndex.
     * @param cryptogram The List that existing duplication.
     * @param startIndex The index that duplication starts in the cryptogram.
     * @return The List that duplication removed.
     */
    private static List<Character> removeDuplication(List<Character> cryptogram,
                                                     int startIndex) {
        cryptogram.remove(startIndex + 1);
        cryptogram.remove(startIndex);
        return cryptogram;
    }
}
