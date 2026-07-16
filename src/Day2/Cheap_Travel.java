package Day2;

import java.util.Scanner;

public class Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//total ride
        int m=sc.nextInt();//ride in m ticket
        int a=sc.nextInt();//price of 1 ride ticket
        int b=sc.nextInt();//price of m ride ticket

        int case1=n*a;
        int case2=((n/m)*b + (n%m)*a);
        int case3=(int) Math.ceil((double) n / m) *b;

        int minCost=Math.min(case1,Math.min(case2,case3));
        System.out.println(minCost);
    }
}
