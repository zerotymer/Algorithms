package ref.common;

import java.util.Arrays;
import edu.princeton.cs.algs4.*;

/**
 * 객체 지향 프로그래밍으로서 이진 탐색 재구현(정수 집합 탐색을 위한 ADT)
 * <br>104p
 */
public class StaticSETofInts {
   
    /// region Fields
    private int[] a;
    /// endregion


    /// region Constructors
    private StaticSETofInts(int[] keys) {
        a = new int[keys.length];
        for (int i = 0; i < keys.length; i++)
            a[i] = keys[i];
        Arrays.sort(a);
    }
    public static StaticSETofInts of(int[] keys) {
        return new StaticSETofInts(keys);
    }
    /// endregion


    /// region Methods
    public boolean contains(int key) {
        return rank(key) != -1;
    }

    private int rank(int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])       hi = mid - 1;
            else if (key > a[mid])  lo = mid + 1;
            else                    return mid;
        }
        return -1;
    }
    /// endregion


    /// region Test
    /// endregion
}
