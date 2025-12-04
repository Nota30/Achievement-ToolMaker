package edu.bsu.cs;

public enum Grade {
    F(0), D(1), C(2), B(3), A(4);

    private final int level;

    Grade(int level) { this.level = level; }

    public int getGrade() { return level; }
}
