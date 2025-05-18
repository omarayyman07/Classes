public class Time {
    double Hours;
    double Minutes;
    double Seconds;
    public Time(double Hours,double Minutes, double Seconds){
        this.Hours=Hours;
        this.Minutes=Minutes;
        this.Seconds=Seconds;
    }
    public double hours(){
        return Hours;
    }
    public double minutes(){
        return Minutes;
    }
    public double Seconds(){
        return Seconds;
    }
    public void addminute(){
        Minutes++;
    }
    public void addsecond(){
        Seconds++;
    }
    public void addhour(){
        Hours++;
    }

}
