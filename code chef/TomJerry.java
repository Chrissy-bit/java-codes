/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class TomJerry
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T>0) {
            String[] input = sc.nextLine().split("\\s+");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);
            if (X < Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
	}
}
