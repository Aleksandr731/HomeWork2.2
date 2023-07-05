public class Ravenclaw extends hogwarts {
    private String cleverness;
    private String wisdom;
    private String wit;
    private String creation;

    public Ravenclaw(String power, String transgressionDistancePower,
                       String cleverness, String wisdom, String wit, String creation) {
        super.hogwarts(power, transgressionDistancePower);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public String getCleverness() {
        return cleverness;
    }

    public void setCleverness(String cleverness) {
        this.cleverness = cleverness;
    }

    public String getWisdom() {
        return wisdom;
    }

    public void setWisdom(String wisdom) {
        this.wisdom = wisdom;
    }

    public String getWit() {
        return wit;
    }

    public void setWit(String wit) {
        this.wit = wit;
    }

    public String getCreation() {
        return creation;
    }

    public void setCreation(String creation) {
        this.creation = creation;
    }

    public String printStudent() {
        return "Факультет: Ravenclaw, " +
                "cleverness='" + cleverness + '\'' +
                ", wisdom='" + wisdom + '\'' +
                ", wit='" + wit + '\'' +
                ", creation='" + creation + '\'' + printPower();
    }
}
