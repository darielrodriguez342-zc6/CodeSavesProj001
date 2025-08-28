import java.util.ArrayList;
public class Character {
   //Attributes
    String name;
    String gym;
    int wins;
    int losses;
    float WLRatio = 1.0f;
    float wTemp;
    float lTemp;


    // Constructor
    public Character (String name, String gym, int wins, int losses){
        this.name = name;
        this.gym = gym;
        this.wins = wins;
        this.losses = losses;
        WLRatioCalc();
    }


    //setters and getters
    public void setName(String name){
        this.name = name;
    }

    public void setGym(String gym){
        this.gym = gym;
    }


    public void setWins(int wins, ArrayList<Integer> recordWL){
        this.wins = wins;
        WLRatioCalc();
    }

    public void setLosses(int losses) {
        this.losses = losses;
        WLRatioCalc();
    }

    //Calculate the ratio of wins to losses
    public void WLRatioCalc(){
        wTemp = wins;
        lTemp = losses;
        WLRatio = wTemp/(lTemp+1);
    }

    public String getName() {
        return name;
    }

    public String getGym() {
        return gym;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public float getWLRatio() {
        return WLRatio;
    }

   // Method that plays when object calls to string
    @Override
    public String toString() {
        return "Character{" +
                "Fighter:' " + name + '\'' +
                ", is fighting out of '" + gym + '\'' +
                ", with " + wins +" wins"+
                ", " + losses +" losses, and a "+
                ", Win Lose Ratio of " + WLRatio +
                '}';
    }
}
