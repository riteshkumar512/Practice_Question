package Day4;

import java.util.Scanner;

public class Minimizing_the_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();

        int i=0;
        while (i < str.length()-1 ){
            char ch1=str.charAt(i);
            char ch2=str.charAt(i+1);

            if (ch1>ch2){
                System.out.println(str.substring(0,i)+str.substring(i+1));
                return;
            }
            i++;
        }
        System.out.println(str.substring(0,str.length()-1));
    }
}
