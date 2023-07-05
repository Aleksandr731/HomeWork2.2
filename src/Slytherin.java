public class Slytherin extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int  resourcefulness;
    private int  lustForPower;

    public Slytherin(int power, int transgressionDistancePower,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super.hogwarts(power, transgressionDistancePower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String printStudent() {
        return "Факультет: Slytherin, " +
                "cunning='" + cunning + '\'' +
                ", determination='" + determination + '\'' +
                ", ambition='" + ambition + '\'' +
                ", resourcefulness='" + resourcefulness + '\'' +
                ", lustForPower='" + lustForPower + '\'' + printPower();
    }
    public int sumProperties() {
        int sum = getCunning() + getDetermination() + getAmbition()
                + getResourcefulness() + getLustForPower();
        return sum;
    }
}
