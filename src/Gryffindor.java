public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int power, int transgressionDistancePower,
                      int nobility, int honor, int bravery) {
        super(name, power, transgressionDistancePower);
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

    public String toString() {
        return "Факультет: Gryffindor, " + super.toString() +
                ", nobility='" + nobility + '\'' +
                ", honor='" + honor + '\'' +
                ", bravery='" + bravery + '\'' ;
    }

    public void compareStudent(Gryffindor gryffindorStudent){
        int sumThis = this.nobility + this.honor + this.bravery;
        int sumGryffindorStudent = gryffindorStudent.getNobility()
                + gryffindorStudent.getHonor() + gryffindorStudent.getBravery();
        if (sumThis > sumGryffindorStudent) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + gryffindorStudent.getName());
        } else System.out.println(gryffindorStudent.getName() + " лучший Гриффиндорец, чем " + this.getName());
    }

}
