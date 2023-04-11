package main.run;

import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class BinarySearch
{
    public static void main(String[] args)
    {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty())
        {   // R키를 읽고, whitelist에 없으면 면 출력한다.
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0)
                StdOut.println(key);
        }
    }

    public static int rank(int key, int[] a)
    {
        return -1;
    }
}