package Day3;

import java.util.*;
public class Micro_World {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Micro(n, k, arr);
    }

    public static void Micro(int n, int k, int[] arr) {
        int i = 0;
        int remaining = 0;
        while(i < arr.length) {
            int start = i;
            while(start < arr.length && arr[start] == arr[i]) {
                start++;
            }

            if(start == arr.length || arr[start]-arr[i] > k) {
                remaining += start-i;
            }

            i = start;
        }

        System.out.println(remaining);

    }

}