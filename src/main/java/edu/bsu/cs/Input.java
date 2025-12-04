package edu.bsu.cs;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public int getAssignment() {
        System.out.println("Enter the number of assignments you have completed: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public int getAchievement() {
        System.out.println("Enter the number of achievements you have completed: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Performance getMidTermReport() {
        System.out.println("Did you complete the mid-semester self-assessment report? (true/false) ");
        if (Boolean.parseBoolean(scanner.nextLine())) return  Performance.FULL;
        else return Performance.OPTIONAL;
    }

    public ProjectLevel getFirstProject() {
        System.out.println("Did you get Starter level or better from the First Project Iteration 1 till the Final Project Iteration 2? (true/false) ");
        if (Boolean.parseBoolean(scanner.nextLine())) return ProjectLevel.STARTER;
        else return ProjectLevel.UNASSESSABLE;
    }

    public ProjectLevel getFinalProject() {
        System.out.println("""
                Enter the level you got for the Final Project Iteration 3:
                >Master = 3
                >Proficient = 2
                >Starter = 1
                >Un-assessable = 0 or out-of-range number""");
        int finalProjectInteger = Integer.parseInt(scanner.nextLine());
        if (finalProjectInteger == 3) return ProjectLevel.MASTER;
        else if (finalProjectInteger == 2) return ProjectLevel.PROFICIENT;
        else if (finalProjectInteger == 1) return ProjectLevel.STARTER;
        else return ProjectLevel.UNASSESSABLE;
    }

    public Performance getFinalExamEssay() {
        System.out.println("""
                Enter the level you got for the Final Exam:
                >Full specifications = 3
                >Nearly meet full specifications = 2
                >Meet minimum specifications = 1
                >Did not complete = 0 or out-of-range number""");
        int finalExamInteger = Integer.parseInt(scanner.nextLine());
        if (finalExamInteger == 3) return Performance.FULL;
        else if (finalExamInteger == 2) return Performance.NEARLY;
        else if (finalExamInteger == 1) return Performance.MINIMUM;
        else return Performance.OPTIONAL;
    }

}
