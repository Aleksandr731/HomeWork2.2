public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int power, int transgressionDistancePower,
                      int industriousness,int loyalty, int honesty) {
        super(name, power, transgressionDistancePower);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String toString() {
        return "Факультет: Hufflepuff, " + super.toString() +
                ", industriousness='" + industriousness + '\'' +
                ", loyalty='" + loyalty + '\'' +
                ", honesty='" + honesty + '\'' ;
    }
    public int sumProperties() {
        int sum = getIndustriousness() + getLoyalty() + getHonesty();
        return sum;
    }

    public void compareStudent(Hufflepuff hufflepuffStudent){
        int sumThis = this.industriousness + this.loyalty + this.honesty;
        int sumHufflepuffStudent = hufflepuffStudent.getIndustriousness()
                + hufflepuffStudent.getLoyalty() + hufflepuffStudent.getHonesty();
        if (sumThis > sumHufflepuffStudent) {
            System.out.println(this.getName() + " лучший Хуффендуец, чем " + hufflepuffStudent.getName());
        } else System.out.println(hufflepuffStudent.getName() + " лучший Хуффендуец, чем " + this.getName());
    }
}
