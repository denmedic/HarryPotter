public class KogtevranStudents extends HogwardsStudents {

    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public KogtevranStudents(String firstName, String lastName, int witchkraft, int transgress, int mind, int wisdom, int wit, int creative) {
        super(firstName, lastName, witchkraft, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public int skill() {
        return mind + wisdom + wit + creative;
    }

    @Override
    public String toString() {
        return super.toString() + "Ум " + getMind() +
                "; Мудрость =" + getWisdom() +
                "; Остроумие " + getWit() +
                "; Творчество " + getCreative();
    }

    public int skill1() {
        return mind + wisdom + wit + creative;
    }
    public void comparisonStudentKogtevran(KogtevranStudents kogtevranStudents) {
        int skillFirst = skill1();
        int skillSecond = kogtevranStudents.skill1();
        if (skillFirst > skillSecond) {
            System.out.println("Когтевранец " + getFirstName() + " " + getLastName() + " лучше, чем когтевранец " + kogtevranStudents.getFirstName() + " " + kogtevranStudents.getLastName());
        } else if (skillFirst < skillSecond) {
            System.out.println("Когтевранец " + getFirstName() + " " + getLastName() + " хуже, чем когтевранец " + kogtevranStudents.getFirstName() + " " + kogtevranStudents.getLastName());
        } else {
            System.out.println("Когтевранец " + getFirstName() + " " + getLastName() + " имеет ту же силу,аналогично " + kogtevranStudents.getFirstName() + " " + kogtevranStudents.getLastName());
        }
    }
}