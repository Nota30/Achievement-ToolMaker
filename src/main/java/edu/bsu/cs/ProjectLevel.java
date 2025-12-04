package edu.bsu.cs;

public enum ProjectLevel {

    UNASSESSABLE(0), STARTER(1), PROFICIENT(2), MASTER(3);

    private final int level;

    ProjectLevel(int level) { this.level = level; }

    public int getLevel() { return level; }
}
