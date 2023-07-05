public class Slytherin extends hogwarts {
    private String cunning;
    private String determination;
    private String ambition;
    private String  resourcefulness;
    private String  lustForPower;

    public Slytherin(String power, String transgressionDistancePower,
                     String cunning, String determination, String ambition,
                     String resourcefulness, String lustForPower) {
        super.hogwarts(power, transgressionDistancePower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public String getCunning() {
        return cunning;
    }

    public void setCunning(String cunning) {
        this.cunning = cunning;
    }

    public String getDetermination() {
        return determination;
    }

    public void setDetermination(String determination) {
        this.determination = determination;
    }

    public String getAmbition() {
        return ambition;
    }

    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }

    public String getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(String resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public String getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(String lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String printStudent() {
        return "Факультет: Slytherin, " +
                "cunning='" + cunning + '\'' +
                ", determination='" + determination + '\'' +
                ", ambition='" + ambition + '\'' +
                ", resourcefulness='" + resourcefulness + '\'' +
                ", lustForPower='" + lustForPower + '\'' + printPower();
    }
}
