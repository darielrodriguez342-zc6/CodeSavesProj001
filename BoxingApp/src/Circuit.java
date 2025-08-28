public class Circuit {
    //Attributes
    String name;
    String date;
    double prize;

    //Constructor
    public Circuit( String cName, String cDate, double cPrize){
        this.name = cName;
        this.date = cDate;
        this.prize = cPrize;
    }
    //Setters and getters
    public String getcName() {
        return name;
    }

    public String getcDate() {
        return date;
    }

    public double getcPrize() {
        return prize;
    }

    public void setcName(String cName) {
        this.name = cName;
    }

    public void setcDate(String cDate) {
        this.date = cDate;
    }

    public void setcPrize(double cPrize) {
        this.prize = cPrize;
    }

    // Print of what object will say
    @Override
    public String toString() {
        return "Circuit{" +
                "cName='" + name + '\'' +
                ", cDate='" + date + '\'' +
                ", cPrize=" + prize +
                '}';
    }
}
