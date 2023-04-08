package ref.run;

import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class BinarySearch 
{    
    public static int rank (int key, int[] a) 
    {
        // Array 'a' must be sorted. 배열 a는 이미 정렬된 상태여야 한다.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) 
        {   // 키가 a[lo..hi]에 있거나 존재하지 않는다.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])   hi = mid - 1;
            else if (key > a[mid])  lo = mid + 1;
            else    return mid;
        }
        return -1;
    }

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
}
