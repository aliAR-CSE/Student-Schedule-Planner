import java.time.LocalDateTime;

/**
 * Represents an educational assessment, such as an assignment,lab or an exam.
 * This class stores details about the assessment including its name, type,
 * due date, grading weight, the grade earned, and whether it is completed.
 *
 * @author Ali Abdul Razak
 * @version 1.0
 * */
public class Assessment{
    /** The name of the assessment. */
    private String assessmentName;
    /** The assessment type (whether it's a lab, exam or test). */
    private String assessmentType;
    /** The date and time that the assessment is due by stored as 2007-12-03T10:15:30. */
    private LocalDateTime dueDate;
    /** How much the assessment is weighted of your total grade as a percentage. */
    private int assessmentWeight;
    /** Numerical value which represents the grade earned on this assessment. */
    private int gradeEarned;
    /** Whether this assessment is pending or completed. */
    private boolean isComplete;

    /**
     * Constructs a new Assessment with the specified details.
     *
     * @param assessmentName   The name of the assessment.
     * @param assessmentType   The type of the assessment (for example, "Assignment" or "Exam").
     * @param dueDate          The date and time the assessment is due.
     * @param assessmentWeight The percentage weight of this assessment in the final course grade.
     * @param gradeEarned      The numerical grade earned on this assessment.
     * @param isComplete       True if the assessment is finished, false otherwise.
     * */
    public Assessment(String assessmentName, String assessmentType, LocalDateTime dueDate, int assessmentWeight, int gradeEarned, boolean isComplete){
        this.assessmentName = assessmentName;
        this.assessmentType = assessmentType;
        this.dueDate = dueDate;
        this.assessmentWeight = assessmentWeight;
        this.gradeEarned = gradeEarned;
        this.isComplete = isComplete;
    }
    /**
     * Constructs a new Assessment with default values.
     * The default name is "New Assessment", the type is "Assignment",
     * the due date is the current date and time, the weight and grade are 0,
     * and it is marked as not complete.
     * */
    public Assessment(){
        this("New Assessment", "Assignment", LocalDateTime.now(), 0, 0, false);
    }

    /**
     * Gets the name of the assessment.
     *
     * @return The current name of the assessment.
     * */
    public String getAssessmentName(){
        return assessmentName;
    }
    /**
     * Sets the name of the assessment.
     *
     * @param assessmentName The new name for the assessment.
     * */
    public void setAssessmentName(String assessmentName){
        this.assessmentName = assessmentName;
    }

    /**
     * Gets the type of the assessment.
     *
     * @return The category or type of the assessment.
     */
    public String getAssessmentType(){
        return assessmentType;
    }
    /**
     * Sets the type of the assessment.
     *
     * @param assessmentType The new type for the assessment.
     * */
    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }

    /**
     * Gets the due date of the assessment.
     *
     * @return The date and time the assessment is due.
     * */
    public LocalDateTime getDueDate(){
        return  dueDate;
    }
    /**
     * Sets the due date of the assessment.
     *
     * @param dueDate The new due date and time.
     * */
    public void setDueDate(LocalDateTime dueDate){
        this.dueDate = dueDate;
    }

    /**
     * Gets the weight of the assessment.
     *
     * @return The percentage weight of the assessment.
     * */
    public int getAssessmentWeight(){
        return assessmentWeight;
    }
    /**
     * Sets the weight of the assessment.
     *
     * @param assessmentWeight The new percentage weight.
     * */
    public void setAssessmentWeight(int assessmentWeight){
        this.assessmentWeight = assessmentWeight;
    }

    /**
     * Gets the grade earned on the assessment.
     *
     * @return The current grade earned.
     * */
    public int getGradeEarned(){
        return gradeEarned;
    }
    /**
     * Sets the grade earned on the assessment.
     *
     * @param gradeEarned The new grade earned.
     * */
    public void setGradeEarned(int gradeEarned){
        this.gradeEarned = gradeEarned;
    }

    /**
     * Checks if the assessment is complete.
     *
     * @return True if the assessment is finished, false otherwise.
     * */
    public boolean getIsComplete(){
        return isComplete;
    }
    /**
     * Sets the completion status of the assessment.
     *
     * @param isComplete The new completion status.
     * */
    public void setIsComplete(boolean isComplete){
        this.isComplete = isComplete;
    }
}
