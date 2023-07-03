public class Gryffindor extends hogwarts {
    private String nobility;
    private String honor;
    private String bravery;


    public Gryffindor(String power, String transgressionDistancePower,
                       String nobility, String honor, String bravery) {
        super.Person(power, transgressionDistancePower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public String getBravery() {
        return bravery;
    }

    public void setBravery(String bravery) {
        this.bravery = bravery;
    }
}
