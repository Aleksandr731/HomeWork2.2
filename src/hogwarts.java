public class hogwarts {
    private int power;
    private int transgressionDistancePower;

    public void hogwarts(int power, int transgressionDistancePower) {
        this.power = power;
        this.transgressionDistancePower = transgressionDistancePower;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgressionDistancepower() {
        return transgressionDistancePower;
    }

    public void setTransgressionDistancepower(int transgressionDistancepower) {
        this.transgressionDistancePower = transgressionDistancepower;
    }

    public String printPower() {
        return ", power='" + power + '\'' +
                ", transgressionDistancePower='" + transgressionDistancePower + '\'';
    }
}
