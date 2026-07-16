package Day2;

import java.util.Scanner;

public class Lefthanders_and_Righthanders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str= sc.next();

        int mid=n/2;

        for (int i = 0; i < mid; i++) {
            char Ch1=str.charAt(i);
            char Ch2=str.charAt(mid+i);

            if (Ch1=='R' && Ch2=='L'){
                System.out.println((mid+i+1)+" "+ (i+1));
            }else {
                System.out.println((i+1) +" "+(mid+i+1));
            }
        }
    }
}
