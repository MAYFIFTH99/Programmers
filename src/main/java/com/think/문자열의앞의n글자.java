package com.think;

/**
 * 문제 설명
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * my_string은 숫자와 알파벳으로 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * 1 ≤ n ≤ my_string의 길이
 * 입출력 예
 * my_string	n	result
 * "ProgrammerS123"	11	"ProgrammerS"
 * "He110W0r1d"	5	"He110"
 * 입출력 예
 * 입출력 예 #1
 *
 * 예제 1번의 my_string에서 앞의 11글자는 "ProgrammerS"이므로 이 문자열을 return 합니다.
 * 입출력 예 #2
 *
 * 예제 2번의 my_string에서 앞의 5글자는 "He110"이므로 이 문자열을 return 합니다.
 */
public class 문자열의앞의n글자 {

    // my_string.length() - n 의 계산식이 뜻하는 바를 이미지화 할 수 있어야 함
    public static String solution(String my_string, int n) {
        return my_string.substring(-1, my_string.length() - n); // 뒤에서 n개를 잘라야 한다.
        /**
         * If str.length() == 9,
         * solution(str, 3) : 뒤에서 3개
         * 1 2 3 4 5 6 7 8 9 에서 7 8 9 를 출력하려면? 최대 길이에서 3을 뺀 값
         */
    }

    public static void main(String[] args) {
        String ans = solution("hello123", 3);
        System.out.println(ans);
    }
}
