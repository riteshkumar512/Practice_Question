package Day2;

import java.util.Scanner;

public class Immobile_Knight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//testcase
        while (t-->0) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            int r=row;
            int c=col;
            boolean found=false;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                   boolean res= isIsolate(i, j,row,col);
                   if (res){
                       found=true;
                       r= row+1;
                       c=col+1;
                       break;
                   }
                }
                if (found){
                    break;
                }
            }
                    System.out.println(r+" "+c);
        }

    }
    public static boolean isIsolate(int x,int y,int row,int col){
        boolean first=(x-2 >=0 && y-1 >=0);
        boolean second=(x-2 >=0 && y+1 <col);
        boolean third=(x+2 < row && y-1 >= 0);
        boolean fourth=(x+2 <row && y+1 < col);
        boolean fifth=(x+1 <row && y+2 <col);
        boolean sixth=(x+1 <row && y-2 >=0);
        boolean seventh=(x-1 >=0 && y+2 <col);
        boolean eighth=(x-1 >=0 && y-2 >=0);

        boolean res=(first || second || third || fourth || fifth || sixth || seventh || eighth );
       if (res){
           return false;
       }
       return true;
    }
}
