public class SlytherinStudents extends HogwardsStudents {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public SlytherinStudents(String firstName, String lastName, int witchkraft, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(firstName, lastName, witchkraft, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public int skill() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "Хитрость " + getCunning() +
                "; Решительность " + getDetermination() +
                "; Амбициозность " + getAmbition() +
                "; Находчивость " + getResourcefulness() +
                "; Жажда власти " + getLustForPower();
    }
    public int skill1() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public void comparisonStudentSlytherin(SlytherinStudents slytherinStudents) {
        int skillFirst = skill1();
        int skillSecond = slytherinStudents.skill1();
        if (skillFirst > skillSecond) {
            System.out.println("Слизеринец " + getFirstName() + " " + getLastName() + " лучше, чем слизеринец " + slytherinStudents.getFirstName() + " " + slytherinStudents.getLastName());
        } else if (skillFirst < skillSecond) {
            System.out.println("Слизеринец " + getFirstName() + " " + getLastName() + " хуже, чем слизеринец " + slytherinStudents.getFirstName() + " " + slytherinStudents.getLastName());
        } else {
            System.out.println("Слизеринец " + getFirstName() + " " + getLastName() + " имеет ту же силу,аналогично " + slytherinStudents.getFirstName() + " " + slytherinStudents.getLastName());
        }
    }
}
