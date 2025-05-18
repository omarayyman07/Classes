public class AttendanceRecord {
    int studentID;
    int absentPoints;
    boolean enrolled;
    public AttendanceRecord(int studentID,boolean enrolled){
        this.studentID=studentID;
        this.enrolled=enrolled;
        this.absentPoints=0;
    }
    public void absentClass(int totalNumberofTutorials){
        this.absentPoints++;
        if(this.absentPoints>0.25*totalNumberofTutorials)
            this.enrolled=false;
    }
    public String display(){
        return "Student ID:"+" "+this.studentID+" "+"Absent Points:"+" "+this.absentPoints+" "+"Enrollment Status:"+" "+this.enrolled;
    }
    public static void main(String[] args){
        AttendanceRecord a1= new AttendanceRecord(5352,true);
        int count=0;
        while(a1.enrolled){
            a1.absentClass(100);
            count++;
        }
        System.out.println(count);
    }
}