public class GryffindorStudents extends HogwardsStudents {

    private int nobility;
    private int honour;
    private int bravery;

    public GryffindorStudents(String firstName, String lastName, int witchkraft, int transgress, int nobility, int honour, int bravery) {
        super(firstName, lastName, witchkraft, transgress);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public int skill() {
        return nobility + honour + bravery;
    }


    @Override
    public String toString() {
        return super.toString() + " Благородство " + getNobility() +
                "; Честь " + getHonour() +
                "; Храбрость " + getBravery();
    }
    public int skill1() {
        return nobility + honour + bravery;
    }
    public void comparisonStudentGryffindor(GryffindorStudents gryffindorStudents) {
        int skillFirst = skill1();
        int skillSecond = gryffindorStudents.skill1();
        if (skillFirst > skillSecond) {
            System.out.println("Гриффиндорец " + getFirstName() + " " + getLastName() + " лучше, чем гриффиндорец " + gryffindorStudents.getFirstName() + " " + gryffindorStudents.getLastName());
        } else if (skillFirst < skillSecond) {
            System.out.println("Гриффиндорец " + getFirstName() + " " + getLastName() + " хуже, чем гриффиндорец " + gryffindorStudents.getFirstName() + " " + gryffindorStudents.getLastName());
        } else {
            System.out.println("Гриффиндорец " + getFirstName() + " " + getLastName() + " имеет ту же силу,аналогично " + gryffindorStudents.getFirstName() + " " + gryffindorStudents.getLastName());

        }
    }
}

