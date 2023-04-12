package main.common;

public class TimeCalculator {
 
    /// region Fields
    private long startTime;
    private long endTime;
    private final String name;
    /// endregion


    /// region Contructors
    private TimeCalculator(String name) {
        startTime = System.currentTimeMillis();
        endTime = System.currentTimeMillis();
        this.name = name;
    }
    public static TimeCalculator createInstance() {
        return new TimeCalculator("TimeCalculator");
    }
    public static TimeCalculator createInstance(String name) {
        return new TimeCalculator(name);
    }
    /// endregion


    /// region Methods
    @Override
    public String toString() {
        return name + ": " + this.getGapTime(TimeUnit.MILLISECONDS) + "(ms) [startTime=" + startTime + "(ns), endTime=" + endTime + "]";
    }
    /// endregion


    /// region Getter & Setter
    public long getStartTime() {
        return startTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void setStartTime() {
        this.startTime = System.currentTimeMillis();
    }
    public long getEndTime() {
        return endTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void setEndTime() {
        this.endTime = System.currentTimeMillis();
    }
    public long getGapTime() {
        return endTime - startTime;
    }
    public long getGapTime(TimeUnit unit) {
        return unit.convert(endTime - startTime, TimeUnit.MILLISECONDS);
    }
    /// endregion

}