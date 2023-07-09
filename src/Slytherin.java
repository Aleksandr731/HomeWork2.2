public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int  resourcefulness;
    private int  lustForPower;

    public Slytherin(String name, int power, int transgressionDistancePower,
                     int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(name, power, transgressionDistancePower);
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

    public String toString() {
        return "Факультет: Slytherin, " + super.toString() +
                ", cunning='" + cunning + '\'' +
                ", determination='" + determination + '\'' +
                ", ambition='" + ambition + '\'' +
                ", resourcefulness='" + resourcefulness + '\'' +
                ", lustForPower='" + lustForPower + '\'' ;
    }
    public int sumProperties() {
        int sum = getCunning() + getDetermination() + getAmbition()
                + getResourcefulness() + getLustForPower();
        return sum;
    }

    public void compareStudent(Slytherin slytherinStudent){
        int sumThis = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int sumSlytherinStudent = slytherinStudent.getCunning() + slytherinStudent.getDetermination()
                + slytherinStudent.getAmbition() + slytherinStudent.getResourcefulness()
                + slytherinStudent.getLustForPower();
        if (sumThis > sumSlytherinStudent) {
            System.out.println(this.getName() + " лучший Слизериновец, чем " + slytherinStudent.getName());
        } else System.out.println(slytherinStudent.getName() + " лучший Слизериновец, чем " + this.getName());
    }
}
