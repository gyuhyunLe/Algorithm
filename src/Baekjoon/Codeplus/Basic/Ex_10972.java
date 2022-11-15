package src.Baekjoon.Codeplus.Basic;

import java.util.Scanner;

/*
문제
1부터 N까지의 수로 이루어진 순열이 있다. 이때, 사전순으로 다음에 오는 순열을 구하는 프로그램을 작성하시오.
사전 순으로 가장 앞서는 순열은 오름차순으로 이루어진 순열이고, 가장 마지막에 오는 순열은 내림차순으로 이루어진 순열이다.

해결
1. arr[i-1] > arr[i]를 만족하는 카장 큰 i를 찾는다.
2. j >= i 이면서 arr[j] < arr[i-1]을 만족하는 가장 큰 j를 찾는다.
3. arr[i-1]과 arr[j]를 swap한다.
4. arr[i]부터 순열을 뒤집는다.
*/
class Ex_10972 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        if(nextStep(arr)) {
            for(int i=0; i<N; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println(-1);
        }

    }
    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static boolean nextStep(int[] arr) {
        int i = arr.length-1;
        // arr[i] > arr[i-1] 찾을 때 까지
        while(i>0 && arr[i-1] >= arr[i]) {
            i -= 1;
        }
        //마지막 index일 시
        if(i <= 0) {
            return false;
        }
        int j = arr.length-1;
        // arr[i] > arr[i-1] 찾을 때 까지
        while(arr[i-1] >= arr[j]) {
            j -= 1;
        }
        //arr[i-1]과 arr[j]를 swap
        swap(arr,i-1,j);

        j = arr.length-1;
        //arr[i]부터 순열을 뒤집는다.
        while(i<j) {
            swap(arr,i,j);
            i += 1;
            j -= 1;
        }
        return true;
    }
}
