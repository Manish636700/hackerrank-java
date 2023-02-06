import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();//a=0
            int b = in.nextInt();// b=2
            int n = in.nextInt();
            int d =1;
            int c = a+b;
            System.out.print(c+" ");
            for(int j=1; j<n; j++)
        {
             int e = d*2;
            int result  = c+b*e;
            System.out.print(result+" ");
            c = result;
            d = e;
        }
        System .out.println();
        }
        in.close();
    }
}
