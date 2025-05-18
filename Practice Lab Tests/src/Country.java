public class Country {
    String countryName;
    int numberOfCitizens;
    boolean royaltyStatus;
    String continent;
    int politicalState;
    public Country(String countryName,int numberOfCitizens,boolean royaltyStatus,String continent){
        this.countryName=countryName;
        this.numberOfCitizens=numberOfCitizens;
        this.royaltyStatus=royaltyStatus;
        this.continent=continent;
        this.politicalState=4;
    }
    public int getPoliticalState(){
        return this.politicalState;
    }
    public boolean royaltyStatus(){
        return this.royaltyStatus;
    }
    public void setDefCon(int p){
        this.politicalState=p;
    }
    public void increaseCitizen(int c){
        this.numberOfCitizens+=c;
    }
    public String display(){
        return "Country Name: " + this.countryName +
                "\nNumber of Citizens: " + this.numberOfCitizens +
                "\nRoyality Status: " + (this.royaltyStatus ? "Royal" : "Not Royal") +
                "\nContinent: " + this.continent +
                "\nPolitical State: " + getPoliticalState();
    }
    public int compareTo(Country a){
        return Math.abs(a.numberOfCitizens-this.numberOfCitizens);
    }
    public static int compareTo(Country a, Country b){
        return Math.abs(a.numberOfCitizens-b.numberOfCitizens);
    }
}
