package Day4;

import java.util.Scanner;

public class AccurateLee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcase
        while (t-- > 0) {
            int n = sc.nextInt();//string length
            String str = sc.next();

            int start = 0;
            while (start < n) {
                char ch = str.charAt(start);
                if (ch == '1') {
                    break;
                }
                start++;
            }
            int end=n-1;
            while (end >=0){
                char ch=str.charAt(end);
                if (ch=='0'){
                    break;
                }
                end--;
            }
//            System.out.println(end);
            if (start>=end){
                System.out.println(str);
            }else {
                String part1=str.substring(0,start);
                String part2=str.substring(end);
                System.out.println(part1+part2);
            }

        }
    }
}
