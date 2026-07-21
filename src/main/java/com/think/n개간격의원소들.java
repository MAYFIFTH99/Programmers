package com.think;

import java.util.Arrays;

/**
 * 문제 설명
 * 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 5 ≤ num_list의 길이 ≤ 20
 * 1 ≤ num_list의 원소 ≤ 9
 * 1 ≤ n ≤ 4
 * 입출력 예
 * num_list	n	result
 * [4, 2, 6, 1, 7, 6]	2	[4, 6, 7]
 * [4, 2, 6, 1, 7, 6]	4	[4, 7]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * [4, 2, 6, 1, 7, 6]에서 2개 간격으로 저장되어 있는 원소들은 [4, 6, 7]입니다.
 * 입출력 예 #2
 *
 * [4, 2, 6, 1, 7, 6]에서 4개 간격으로 저장되어 있는 원소들은 [4, 7]입니다.
 */
public class n개간격의원소들 {

    public static void main(String[] args) {
        int[] result = Solution1.solution(new int[]{4, 2, 6, 1, 7, 6}, 4);
        System.out.println(Arrays.toString(result));
    }

    static class Solution1{
        // 원소가 6개일 때 - 3개 필요 n/2
        // 원소가 7개일 때 - 4개 필요 n/2 + 1
        public static int[] solution(int[] num_list, int n) {

            // Think1 : 배열의 길이가 n으로 나누었을 때 나머지가 남는다면, 필요한 크기에 +1을 해준다.
            int size = num_list.length % n != 0 ? num_list.length/n + 1 : num_list.length/n;

            // Think2 : 위 식을 좀 풀어보면
            int size2 = num_list.length / n;

            if (num_list.length % n != 0) {
                size2++;
            }

            //Think3 : 위 식을 다시 공식화 한다면
            int size3 = (num_list.length + n - 1) / n;
            // ★★★★ (전체 길이 + 간격 -1 ) / 간격 ★★★★


            //----- 풀이
            int[] arr = new int[size3];

            for (int i = 0, j=0; i < num_list.length; i+=n) {
                arr[j++] = num_list[i];
            }

            System.out.println(Arrays.toString(arr));
            return arr;
        }
    }
}
