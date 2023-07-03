public class Hufflepuff extends hogwarts {
    private String industriousness;
    private String loyalty;
    private String honesty;

    public Hufflepuff(String power, String transgressionDistancepower,
                       String industriousness, String loyalty, String honesty) {
        super.Person(power, transgressionDistancepower);
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
}
