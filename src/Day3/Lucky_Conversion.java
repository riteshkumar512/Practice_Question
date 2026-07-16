package Day3;

import java.util.Scanner;

public class Lucky_Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B= sc.next();

        int type1=0;
        int type2=0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)){
                if (A.charAt(i)=='4' && B.charAt(i)=='7'){
                    type1++;
                }else if (A.charAt(i)=='7' && B.charAt(i)=='4'){
                    type2++;
                }
            }

        }
        int swap=Math.min(type1,type2);
        int remOp=Math.abs(type2-type1);
        int tOps=swap+remOp;
        System.out.println(tOps);

        }
    }

