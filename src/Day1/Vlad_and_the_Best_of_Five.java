package Day1;

import java.util.Scanner;

public class Vlad_and_the_Best_of_Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //testcase
        int t=sc.nextInt();
        while (t-->0){
            String str=sc.next();
            int count=0;
            for (int i=0;i<str.length();i++){
                if (str.charAt(i)=='A'){
                    count++;
                }
            }
            if (count >=3){
                System.out.println("A");
            }else {
                System.out.println("B");
            }
        }
    }
}
