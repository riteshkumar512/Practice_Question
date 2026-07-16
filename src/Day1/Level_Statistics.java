package Day1;

import java.util.Scanner;

public class Level_Statistics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//testcase

        while (t-->0){

            boolean possible =true;
            int stat=sc.nextInt();//statics


            int prevP = 0;
            int prevC = 0;

            for (int i = 0; i < stat; i++) {
                int pi = sc.nextInt();
                int ci = sc.nextInt();

                if (pi < ci) {
                    possible = false;
                }

                if (pi < prevP) {
                    possible = false;
                }

                if (ci < prevC) {
                    possible = false;
                }

                if ((ci - prevC) > (pi - prevP)) {
                    possible = false;
                }

                prevP=pi;
                prevC=ci;


            }


            if (possible){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
