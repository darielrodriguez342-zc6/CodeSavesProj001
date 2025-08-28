public class Gym {
    //Attributes
    String name;
    String location;
    int activeFighters;

    //Constructors
    public Gym(String gymName, String gymLocation, int activeFighters){
        this.name = gymName;
        this.location = gymLocation;
        this.activeFighters = activeFighters;
    }

    //setters and getters
    public void setGymName(String gymName) {
        this.name = gymName;
    }
    public void setGymLocation(String gymLocation) {
        this.location = gymLocation;
    }
    public void setActiveFighters(int activeFighters) {
        this.activeFighters = activeFighters;
    }

    public String getGymName() {
        return name;
    }

    public String getGymLocation() {
        return location;
    }

    public int getActiveFighters() {
        return activeFighters;
    }
    // System output for object
    @Override
    public String toString() {
        return "Gym{" +
                "gymName=' " + name + '\'' +
                ", gymLocation=' " + location + '\'' +
                ", activeFighters= " + activeFighters +
                '}';
    }
}
