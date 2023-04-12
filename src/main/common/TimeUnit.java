package main.common;

public enum TimeUnit {
    NANOSECONDS(1),
    MICROSECONDS(1000),
    MILLISECONDS(1000000),
    SECONDS(1000000000),
    MINUTES(60000000000L),
    HOURS(3600000000000L),
    DAYS(86400000000000L);
    
    private final long value;
    
    private TimeUnit(long value) {
        this.value = value;
    }
    
    public long getValue() {
        return value;
    }
    
    public long convert(long sourceDuration, TimeUnit sourceUnit) {
        return sourceDuration * sourceUnit.value / value;
    }
    
    public static void main(String[] args) {
        TimeUnit unit = TimeUnit.SECONDS;
        System.out.println(unit.convert(1, TimeUnit.MILLISECONDS));
    }
    
}
