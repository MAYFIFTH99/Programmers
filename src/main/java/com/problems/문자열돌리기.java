package com.problems;

import java.util.Scanner;

/**
 * 문제 설명
 * 문자열 str이 주어집니다.
 * 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
 *
 * 제한사항
 * 1 ≤ str의 길이 ≤ 10
 *
 * 입출력 예
 * 입력 #1
 *
 * abcde
 * 출력 #1
 *
 * a
 * b
 * c
 * d
 * e
 */
public class 문자열돌리기 {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        String str = c.nextLine();

        // 간결한 풀이
        for (char c1 : str.toCharArray()) { // 향상된 for문 (for-each), str 자리에는 반복 가능한 iterable 객체가 들어와야 하기 때문에, String 을 CharArray로 변환하는 과정이 필요.
            System.out.println(c1);
        }

        // 초급 풀이
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
