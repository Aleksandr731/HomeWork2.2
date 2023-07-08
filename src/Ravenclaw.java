public class Ravenclaw extends Hogwarts {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int power, int transgressionDistancePower,
                     int cleverness, int wisdom, int wit, int creation) {
        super(name, power, transgressionDistancePower);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public String printStudent() {
        return "Факультет: Ravenclaw, " + printPower() +
                ", cleverness='" + cleverness + '\'' +
                ", wisdom='" + wisdom + '\'' +
                ", wit='" + wit + '\'' +
                ", creation='" + creation + '\'' ;
    }
    public int sumProperties() {
        int sum = getCleverness() + getWisdom() + getWit() + getCreation();
        return sum;
    }

    public void compareStudent(Ravenclaw ravenclawStudent){
        int sumThis = this.cleverness + this.wisdom + this.wit + this.creation;
        int sumRavenclawStudent = ravenclawStudent.getCleverness() + ravenclawStudent.getWisdom()
                + ravenclawStudent.getWit() + ravenclawStudent.getCreation();
        if (sumThis > sumRavenclawStudent) {
            System.out.println("Чжоу лучший Когтевранец, чем Падма");
        } else System.out.println("Падма лучший Когтевранец, чем Чжоу");
    }
}
