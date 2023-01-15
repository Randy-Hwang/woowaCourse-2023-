package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    /**
     * 매개변수로 받은 cryptogram을 list로 변환한다.
     * checkDuplication 메서드를 활용해 중복이 있는지 검사하고, True를 리턴할 경우 ->
     * removeDuplication 메서드를 활용해 중복 제거를 반복한다.
     * False를 리턴할 경우 list를 string으로 바꾸어 answer에 대입한다.
     * @param cryptogram 해독해야할 암호문
     * @return 암호문을 해독하여 얻어낸 정답 문자열
     */
    public static String solution(String cryptogram) {
        String answer = "answer";
        List<Character> answerList = new ArrayList<>();

        List<Character> listCryptogram = new ArrayList<>();
        for (int i = 0; i < cryptogram.length(); i++) {
            String lowerCryptogram = cryptogram.toLowerCase();
            listCryptogram.add(lowerCryptogram.charAt(i));
        }

        while (!checkDuplication(listCryptogram)) {
            int startIndex = 0;
            answerList = removeDuplication(listCryptogram, startIndex);
        }

        return answer;
    }

    /**
     * This method will check whether any duplications exist or not.
     * If duplication is not founded, return False.
     * If duplication is founded, return True.
     * @param cryptogram The list that will check duplication.
     * @return result boolean value that any duplication is exist or not.
     */
    private static boolean checkDuplication(List<Character> cryptogram) {
        boolean answer = false;

        return answer;
    }

    /**
     * This method removes duplication based on startIndex.
     * @param cryptogram The List that existing duplication.
     * @param startIndex The index that duplication starts.
     * @return The List that duplication removed.
     */
    private static List<Character> removeDuplication(List<Character> cryptogram,
                                                     int startIndex) {

        return cryptogram;
    }
}
