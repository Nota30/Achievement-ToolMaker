package edu.bsu.cs;

public enum Performance {
    OPTIONAL(0), MINIMUM(1), NEARLY(2), FULL(3);

    private final int level;

    Performance(int level) { this.level = level; }

    public int getPerformance() { return level; }
}
