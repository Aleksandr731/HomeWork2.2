public class Hufflepuff extends hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int power, int transgressionDistancePower,
                      int industriousness,int loyalty, int honesty) {
        super.hogwarts(power, transgressionDistancePower);
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

    public String printStudent() {
        return "Факультет: Hufflepuff, " +
                "industriousness='" + industriousness + '\'' +
                ", loyalty='" + loyalty + '\'' +
                ", honesty='" + honesty + '\'' + printPower();
    }
    public int sumProperties() {
        int sum = getIndustriousness() + getLoyalty() + getHonesty();
        return sum;
    }
}
