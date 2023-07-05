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

    public String getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(String industriousness) {
        this.industriousness = industriousness;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getHonesty() {
        return honesty;
    }

    public void setHonesty(String honesty) {
        this.honesty = honesty;
    }

    public String printStudent() {
        return "Факультет: Hufflepuff, " +
                "industriousness='" + industriousness + '\'' +
                ", loyalty='" + loyalty + '\'' +
                ", honesty='" + honesty + '\'' + printPower();
    }
}
