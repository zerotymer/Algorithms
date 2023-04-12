package main.run;

import main.common.MathUtils;
/**
 * 1.2.16 유리수. 유리수에 대한 덧셈, 뺼셈, 곱셈, 나눗셈을 지원하는 불변 데이터 타입 Rational을 구현하라.
 * <br>121p
 */
public class Rational {
    
    private final static Rational ZERO = Rational.of(0, 1);
    private final static Rational INFINITE = Rational.of(1, 0);
    
    /// region Fields
    private final int numerator;
    private final int denominator;
    /// endregion


    /// region Constructors
    private Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static Rational from(int numerator, int denominator) {
        return new Rational(numerator, denominator);
    }
    public static Rational of(int numerator, int denominator) {
        return new Rational(numerator, denominator);
    }
    public static Rational valueOf(int numerator, int denominator) {
        return new Rational(numerator, denominator);
    }
    /// endregion


    /// region Methods
    public Rational plus(Rational b) {
        int numerator = this.numerator * b.denominator + this.denominator * b.numerator;
        int denominator = this.denominator * b.denominator;
        if (denominator == 0)           return Rational.INFINITE;
        else if (numerator == 0)        return Rational.ZERO;

        int gcd = MathUtils.gcd(numerator, denominator);
        return Rational.of(numerator / gcd, denominator / gcd);
    }
    public Rational minus(Rational b) {
        int numerator = this.numerator * b.denominator - this.denominator * b.numerator;
        int denominator = this.denominator * b.denominator;
        if (denominator == 0)           return Rational.INFINITE;
        else if (numerator == 0)        return Rational.ZERO;

        int gcd = MathUtils.gcd(numerator, denominator);
        return Rational.of(numerator / gcd, denominator / gcd);
    }
    public Rational times(Rational b) {
        int numerator = this.numerator * b.numerator;
        int denominator = this.denominator * b.denominator;
        if (denominator == 0)           return Rational.INFINITE;
        else if (numerator == 0)        return Rational.ZERO;

        int gcd = MathUtils.gcd(numerator, denominator);
        return Rational.of(numerator / gcd, denominator / gcd);
    }
    public Rational divideBy(Rational b) {
        int numerator = this.numerator * b.denominator;
        int denominator = this.denominator * b.numerator;
        if (denominator == 0)           return Rational.INFINITE;
        else if (numerator == 0)        return Rational.ZERO;
        
        int gcd = MathUtils.gcd(numerator, denominator);
        return Rational.of(numerator / gcd, denominator / gcd);
    }
    public boolean equals(Rational that) {
        if (that.minus(this).numerator == 0)    return true;
        else                                    return false;
    }
    @Override
    public String toString() {
        return null;
    }
    /// endregion


    /// region Test
    /// endregion
}
