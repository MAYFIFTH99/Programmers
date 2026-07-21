package com.problems.기초;

/**
 *문제 설명
 * 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
 *
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 200
 * arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
 * 입출력 예
 * arr	result
 * ["a","b","c"]	"abc"
 */
public class 문자리스트를문자열로변환하기 {

    public static void main(String[] args) {
        String result = Solution.solution(new String[]{"a", "b", "c"});
        System.out.println(result);
        String result2 = Solution.solution2(new String[]{"a", "b", "c"});
        System.out.println(result2);

    }
    static class Solution {
        public static String solution(String[] arr) {
            StringBuilder sb = new StringBuilder();

            for (String s : arr) {
                sb.append(s);
            }
            return sb.toString();
        }

        public static String solution2(String[] arr) {
            return String.join("", arr);
        }
    }
}
