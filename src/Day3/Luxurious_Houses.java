package Day3;

import java.util.Scanner;

public class Luxurious_Houses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//No of houses
        int[] floor=new int[n];
        for (int i = 0; i < floor.length; i++) {
            floor[i]=sc.nextInt();
        }
        int [] ans=new int[n];
        ans[floor.length-1]=0;
        int maxheight=0;
        for (int i = floor.length-1; i >= 0 ; i--) {
            int current= floor[i];
            maxheight=Math.max(current,maxheight);
           if (current>=maxheight){
               ans[i]=0;
           }else {
               ans[i]=maxheight-current+1;
           }

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
}
