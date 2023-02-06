import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        if(B >=1 && H >=1)
            {
                int area = B*H;
                System.out.println(area);
            }
        else 
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");          
        } 
    }
}
