package onboarding;

import java.util.List;

class Problem1 {
    /**
     * gettingBig를 활용하여 포비와 크롱의 가능한 가장 큰 값을 도출한다.
     * solution 함수에서 두 값을 비교하며 answer를 리턴한다.
     * 예외사항의 경우, 왼쪽과 오른쪽 페이지가 연속된 값이 아닐 수 있으므로 이를 사전에 처리한다.
     * @param pobi 포비가 펼친 페이지가 적힌 리스트
     * @param crong 크롱이 펼친 페이지가 적힌 리스트
     * @return 답안
     */
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer;

        int pobiNum = gettingBig(pobi);
        int crongNum = gettingBig(crong);

        if (pobi.get(1) - pobi.get(0) != 1 || crong.get(1) - crong.get(0) != 1) {
            answer = -1;
        } else {
            if (pobiNum > crongNum) {
                answer = 1;
            } else if (pobiNum < crongNum) {
                answer = 2;
            } else {
                answer = 0;
            }
        }

        return answer;
    }

    /**
     * biggerWay 함수를 사용하여 페이지의 각 자릿수를 합치는 것과 곱하는 것 중 큰 값을 얻어낸다.
     * @param character 큰 값을 얻어내고자 하는 캐릭터가 펼친 페이지 수가 담긴 리스트
     * @return biggerWay 를 활용하여 얻어낸 값을 비교하여 최종적으로 가장 큰 값
     */
    private static int gettingBig(List<Integer> character) {
        int bigValue;
        int leftPageNum = character.get(0);
        int rightPageNum = character.get(1);

        leftPageNum = biggerWay(leftPageNum);
        rightPageNum = biggerWay(rightPageNum);

        bigValue = Math.max(leftPageNum, rightPageNum);

        return bigValue;
    }

    /**
     * @param num 왼쪽 혹은 오른쪽 페이지
     * @return 곱하는 것과 더하는 것 중 더 큰 값
     */
    private static int biggerWay(int num) {
        int bigValue;
        if ((num / 100) != 0) {
            int hundredsDigit = num / 100;
            int tensDigit = (num % 100) / 10;
            int onesDigit = num % 10;
            int sum = hundredsDigit + tensDigit + onesDigit;
            int mul = hundredsDigit * tensDigit * onesDigit;

            bigValue = Math.max(sum, mul);

        } else if ((num / 10) != 0) {
            int tensDigit = num / 10;
            int onesDigit = num % 10;
            int sum = tensDigit + onesDigit;
            int mul = tensDigit * onesDigit;

            bigValue = Math.max(sum, mul);
        } else {
            bigValue = num;
        }

        return bigValue;
    }
}