import java.time.LocalDateTime;

public class Assessment{

    private String assessmentName;
    private String assessmentType;
    private LocalDateTime dueDate;
    private int assessmentWeight;
    private int gradeEarned;
    private boolean isComplete;

    public Assessment(String assessmentName, String assessmentType, LocalDateTime dueDate, int assessmentWeight, int gradeEarned, boolean isComplete){
        this.assessmentName = assessmentName;
        this.assessmentType = assessmentType;
        this.dueDate = dueDate;
        this.assessmentWeight = assessmentWeight;
        this.gradeEarned = gradeEarned;
        this.isComplete = isComplete;
    }
    public Assessment(){
        this("New Assessment", "Assignment", LocalDateTime.now(), 0, 0, false);
    }
}
