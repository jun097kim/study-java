package jungsuk.ch6;

/**
 * Created by jun097kim on 2017-09-19.
 */
public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    static void sortArr(int[] arr) {
        // 버블 정렬: 두 인접한 원소를 검사하여 정렬하는 방법. O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {  // 0~4
            for (int j = 0; j < arr.length - 1 - i; j++) {  // 0~4, 0~3, 0~2, 0~1, 0~0
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
