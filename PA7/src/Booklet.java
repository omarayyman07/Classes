public class Booklet {
    int pagenum;
    char linetype;
    int linenum;
    public Booklet(int pagenum,char linetype){
        this.pagenum=pagenum;
        this.linetype=linetype;
        if(linetype=='S'){
            this.linenum=30;
        }else if(linetype=='N'){
            this.linenum=50;
        }
    }
    public boolean canHaveCover(double paperThickness, double coverthickness){
        double tott=0;
        tott=(paperThickness*pagenum)+(2*coverthickness);
        if(tott<90)
            return true;
        return false;

    }

}
