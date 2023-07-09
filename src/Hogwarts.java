public abstract class Hogwarts {
    private String name;
    private int power;
    private int transgressionDistancePower;

    public Hogwarts(String name, int power, int transgressionDistancePower) {
        this.name = name;
        this.power = power;
        this.transgressionDistancePower = transgressionDistancePower;
    }

    public String getName() {
        return name;
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

    public String toString() {
        return  "name='" + name + '\'' + ", power='" + power + '\'' +
                ", transgressionDistancePower='" + transgressionDistancePower + '\'';
    }
    public void compareStudent(Hogwarts hogwartsStudent){
        int sumThis = this.power + this.transgressionDistancePower;
        int sumHogwartsStudent = hogwartsStudent.getPower() + hogwartsStudent.getTransgressionDistancepower();
        if (sumThis > sumHogwartsStudent) {
            System.out.println(this.name + " обладает бОльшей мощностью магии, чем " + hogwartsStudent.getName());
        } else System.out.println(hogwartsStudent.getName() + " обладает бОльшей мощностью магии, чем " + this.name);
    }

}
