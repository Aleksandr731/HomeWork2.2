public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(int power, int transgressionDistancePower,
                      int nobility, int honor, int bravery) {
        super.hogwarts(power, transgressionDistancePower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String printStudent() {
        return "Факультет: Gryffindor, " +
                "nobility='" + nobility + '\'' +
                ", honor='" + honor + '\'' +
                ", bravery='" + bravery + '\'' + printPower();
    }

    public void bestStudent() {
        int sumFirstStudent = getNobility() + getHonor() + getBravery() + getPower() + getTransgressionDistancepower();
        int sumSecondStudent = getNobility() + getHonor() + getBravery() + getPower() + getTransgressionDistancepower();
        if (sumFirstStudent < sumSecondStudent) {

        }
        {

        }
    }
}
