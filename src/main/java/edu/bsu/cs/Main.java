package edu.bsu.cs;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();

        int assignments = input.getAssignment();
        int achievements = input.getAchievement();
        Performance midTermReport = input.getMidTermReport();
        ProjectLevel firstProject = input.getFirstProject();
        ProjectLevel finalProject = input.getFinalProject();
        Performance finalExam = input.getFinalExamEssay();

        Calculator calculator = new Calculator(assignments, achievements, midTermReport, firstProject, finalProject, finalExam);
        System.out.println("Your final grade is: " + calculator.getGrade());
    }
}
