/*
You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

 can range between  to  inclusive.

Sample Input 0

100
Sample Output 0

Good job
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
                String s = Integer.toString(n);
                if(n == Integer.parseInt(s))
                {
                        System.out.println("Good job");
                }
                else
                        System.out.println("wrong Answer");
        }
        catch(Exception e)
        {
                System.out.println("wrong ");
        }
    }
}
