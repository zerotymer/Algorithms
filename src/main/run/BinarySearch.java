package main.run;

import java.util.Arrays;
import edu.princeton.cs.algs4.*;
import main.common.TimeCalculator;
import main.common.TimeUnit;

public class BinarySearch
{
    public static void main(String[] args)
    {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);
        TimeCalculator timer = TimeCalculator.createInstance();
        while (!StdIn.isEmpty())
        {   // R키를 읽고, whitelist에 없으면 면 출력한다.
            int key = StdIn.readInt();
            String output = key + "\t";
            timer.setStartTime();
            if (rank(key, whitelist) < 0) {
                timer.setEndTime();
                output += "rank ( " + timer.getGapTime(TimeUnit.NANOSECONDS) + "ns )\t";
            }
            timer.setStartTime();
            if (rank2(key, whitelist, 0, whitelist.length - 1) < 0) {
                timer.setEndTime();
                output += "rank2 ( " + timer.getGapTime(TimeUnit.NANOSECONDS) + "ns )";
            }
            StdOut.println(output);
        }
    }

    public static int rank(int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {   // 키가 a[lo..hi]에 있거나 존재하지 않는다.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])       hi = mid - 1;
            else if (key > a[mid])  lo = mid + 1;
            else                    return mid;
        }

        return -1;
    }

    /**
     * 재귀함수
     * @param key
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    public static int rank2(int key, int[] a, int lo, int hi)
    {
        if (lo > hi)    return -1;

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid])           return rank2(key, a, lo, mid - 1);
        else if (key > a[mid])      return rank2(key, a, mid + 1, hi);
        else                        return mid;
    }
}