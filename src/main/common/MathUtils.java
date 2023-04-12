package main.common;

public class MathUtils {
    
    /// region Fields
    /// endregion
    
    
    /// region Constructors
    private MathUtils() {
    }
    /// endregion
    
    
    /// region Methods
    public static int gcd(int p, int q) {
        if (p == 0 || q == 0)  return 1;
        return q > 1 ? gcd(q, p % q) : p;
    }
    /// endregion
    
    
    /// region Test
    /// endregion
}
