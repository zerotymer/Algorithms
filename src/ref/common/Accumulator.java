package ref.common;

import edu.princeton.cs.algs4.*;

/**
 * 표 1-35 데이터 값 누적기의 추상 데이터 타입
 * <br>98p
 */
public class Accumulator {
    
    /// region Fields
    protected double total = 0.0;
    protected int N = 0;
    /// endregion


    /// region Contructors
    protected Accumulator() {
    }
    protected Accumulator(double total, int n) {
        this.total = total;
        this.N = n;
    }
    public static Accumulator createInstance() {
        return new Accumulator();
    }
    public static Accumulator createInstance(double total) {
        return new Accumulator(total, 0);
    }
    
    /// endregion


    /// region Methods
    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean() {
        if (N == 0) return Double.NEGATIVE_INFINITY;
        return total / N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }
    /// endregion


    /// region Test main
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        Accumulator a = Accumulator.createInstance();
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
    /// endregion

}
