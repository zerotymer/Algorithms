package ref.common;

import edu.princeton.cs.algs4.*;

/**
 * 
 */
public class VisualAccumulator extends Accumulator {
    
    /// region Fields
    /// endregion


    /// region Contructors
    private VisualAccumulator(int trials, double max) {
        super();
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }
    public static VisualAccumulator createInstance(int trials, double max) {
        return new VisualAccumulator(trials, max);
    }
    /// endregion


    /// region Methods
    @Override
    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, mean());
    }
    /// endregion


    /// region Test
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = VisualAccumulator.createInstance(T, 1.0);
        for (int t = 0; t < T; t++)
            a.addDataValue(StdRandom.random());
        StdOut.println(a);
    }
    /// endregion
    
}
