package ref.common;

import edu.princeton.cs.algs4.StdOut;

public class Counter {

    /// region Fields
    private final String name;
    private int count;
    /// endregion


    /// region Contructors
    private Counter(String id) {
        name = id;
    }
    /**
     * id를 이름으로 하여 카운터 생성
     * @param id
     * @return
     */
    public static Counter createInstance(String id) {
        return new Counter(id);
    }
    /// endregion


    /// region Methods
    /**
     * 카운터 증가
     */
    public void increment() {
        count++;
    }
    /**
     * 생성 이후 카운터 누적 증가 값
     * @return
     */
    public int tally() {
        return count;
    }
    @Override
    public String toString() {
        return count + " " + name;
    }
    /// endregion


    /// region Getters & Setters
    /// endregion


    /// region Test
    public static void main(String[] args) {
        Counter heads = Counter.createInstance("heads");
        Counter tails = Counter.createInstance("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        StdOut.println(heads + " " + tails);
        StdOut.println(heads.tally() + tails.tally());
    }
    /// endregion
}
