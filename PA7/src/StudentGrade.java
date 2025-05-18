public class StudentGrade {
    String studentName;
    double assignmentScore;
    double quizScore;
    double examScore;
    public StudentGrade(String studentName,double assignmentScore, double quizScore, double examScore){
        this.studentName=studentName;
        this.assignmentScore=assignmentScore;
        this.examScore=examScore;
        this.quizScore=quizScore;
    }
    public char calculateFinalGrade(){
        double finalGrade=(0.2*assignmentScore)+(0.3*quizScore)+(0.5*examScore);
        if(finalGrade>=90){
            return 'A';
        }else if (finalGrade>=80){
            return 'B';
        }else if (finalGrade>=70){
            return 'C';
        }else if (finalGrade>=60){
            return 'D';
        }else
            return 'F';


    }
    public static void main(String[] args){
        StudentGrade s1=new StudentGrade("Omar", 95,45,87);
    System.out.println(s1.calculateFinalGrade());
    }

}
