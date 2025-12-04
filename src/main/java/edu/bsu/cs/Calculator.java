package edu.bsu.cs;

public class Calculator {
    private final int assignments;
    private final int achievement;
    private final Performance midtermReport;
    private final ProjectLevel firstProject;
    private final ProjectLevel finalProject;
    private final Performance finalEssay;

    Calculator(
            int assignments,
            int achievement,
            Performance midtermReport,
            ProjectLevel firstProject,
            ProjectLevel finalProject,
            Performance finalEssay)
    {
        this.assignments = assignments;
        this.achievement = achievement;
        this.midtermReport = midtermReport;
        this.firstProject = firstProject;
        this.finalProject = finalProject;
        this.finalEssay = finalEssay;
    }

    public Grade getGrade() {
        Grade assignmentSpecs = checkAssignments();
        Grade achievementSpecs = checkAchievements();
        Grade midTermReportSpecs = checkMidtermReport();
        Grade firstProjectSpecs = checkFirstProject();
        Grade finalProjectSpecs = checkFinalProject();
        Grade finalEssaySpecs = checkFinalEssay();

        Grade[] grades = {assignmentSpecs, achievementSpecs, midTermReportSpecs, firstProjectSpecs, finalProjectSpecs, finalEssaySpecs};

        return getMinimumGrade(grades);
    }

    private Grade getMinimumGrade(Grade[] grades) {
        Grade minimumValue = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getGrade() < minimumValue.getGrade()) minimumValue = grades[i];
        }

        return minimumValue;
    }

    private Grade checkAssignments() {
        if (assignments >= Specifications.ASSIGNMENTS_A) return Grade.A;
        else if (assignments >= Specifications.ASSIGNMENTS_B) return Grade.B;
        else if (assignments >= Specifications.ASSIGNMENTS_C) return Grade.C;
        else if (assignments >= Specifications.ASSIGNMENTS_D) return Grade.D;
        else return Grade.F;
    }

    private Grade checkAchievements() {
        if (achievement >= Specifications.ACHIEVEMENTS_A) return Grade.A;
        else if (achievement >= Specifications.ACHIEVEMENTS_B) return Grade.B;
        else if (achievement >= Specifications.ACHIEVEMENTS_C) return Grade.C;
        else if (achievement >= Specifications.ACHIEVEMENTS_D) return Grade.D;
        else return Grade.F;
    }

    private Grade checkMidtermReport() {
        if (midtermReport.getPerformance() >= Specifications.MIDTERM_REPORT_A.getPerformance()) return Grade.A;
        else if (midtermReport.getPerformance() >= Specifications.MIDTERM_REPORT_B.getPerformance()) return Grade.B;
        else if (midtermReport.getPerformance() >= Specifications.MIDTERM_REPORT_C.getPerformance()) return Grade.C;
        else if (midtermReport.getPerformance() >= Specifications.MIDTERM_REPORT_D.getPerformance()) return Grade.D;
        else return Grade.F;
    }

    private Grade checkFirstProject() {
        if (firstProject.getLevel() >= Specifications.FIRST_PROJECT_A.getLevel()) return Grade.A;
        else if (firstProject.getLevel() >= Specifications.FIRST_PROJECT_B.getLevel()) return Grade.B;
        else if (firstProject.getLevel() >= Specifications.FIRST_PROJECT_C.getLevel()) return Grade.C;
        else if (firstProject.getLevel() >= Specifications.FIRST_PROJECT_D.getLevel()) return Grade.D;
        else return Grade.F;
    }

    private Grade checkFinalProject() {
        if (finalProject.getLevel() >= Specifications.FINAL_PROJECT_A.getLevel()) return Grade.A;
        else if (finalProject.getLevel() >= Specifications.FINAL_PROJECT_B.getLevel()) return Grade.B;
        else if (finalProject.getLevel() >= Specifications.FINAL_PROJECT_C.getLevel()) return Grade.C;
        else if (finalProject.getLevel() >= Specifications.FINAL_PROJECT_D.getLevel()) return Grade.D;
        else return Grade.F;
    }

    private Grade checkFinalEssay() {
        if (finalEssay.getPerformance() >= Specifications.FINAL_EXAM_A.getPerformance()) return Grade.A;
        else if (finalEssay.getPerformance() >= Specifications.FINAL_EXAM_B.getPerformance()) return Grade.B;
        else if (finalEssay.getPerformance() >= Specifications.FINAL_EXAM_C.getPerformance()) return Grade.C;
        else if (finalEssay.getPerformance() >= Specifications.FINAL_EXAM_D.getPerformance()) return Grade.D;
        else return Grade.F;
    }
}
