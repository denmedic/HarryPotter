public class PuffendyStudents extends HogwardsStudents {

    private int industriousness;
    private int loyalty;
    private int honour;

    public PuffendyStudents(String firstName, String lastName, int witchkraft, int transgress, int industriousness, int loyalty, int honour) {
        super(firstName, lastName, witchkraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honour = honour;
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

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    @Override
    public int skill() {
        return industriousness + loyalty + honour;
    }

    @Override
    public String toString() {
        return super.toString() + "Трудолюбие " + getIndustriousness() +
                "; Верность " + getLoyalty() +
                "; Честность " + getHonour();
    }

    public int skill1() {
        return industriousness + loyalty + honour;
    }
    public void comparisonStudentPuffendy(PuffendyStudents puffendyStudents) {
        int skillFirst = skill1();
        int skillSecond = puffendyStudents.skill1();
        if (skillFirst > skillSecond) {
            System.out.println("Пуффендуец " + getFirstName() + " " + getLastName() + " лучше, чем пуффендуец " + puffendyStudents.getFirstName() + " " + puffendyStudents.getLastName());
        } else if (skillFirst < skillSecond) {
            System.out.println("Пуффендуец " + getFirstName() + " " + getLastName() + " хуже, чем пуффендуец " + puffendyStudents.getFirstName() + " " + puffendyStudents.getLastName());
        } else {
            System.out.println("Пуффендуец " + getFirstName() + " " + getLastName() + " имеет ту же силу,аналогично " + puffendyStudents.getFirstName() + " " + puffendyStudents.getLastName());
        }
    }
}