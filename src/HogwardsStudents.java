public abstract class HogwardsStudents {
    private String firstName;
    private String lastName;
    private int witchkraft;
    private int transgress;

    public HogwardsStudents(String firstName, String lastName, int witchkraft, int transgress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.witchkraft = witchkraft;
        this.transgress = transgress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWitchkraft() {
        return witchkraft;
    }

    public void setWitchkraft(int witchkraft) {
        this.witchkraft = witchkraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Имя " + getFirstName() +
                "; Фамилия " + getLastName() +
                "; Сила магии " + getWitchkraft() +
                "; трансгрессия " + getTransgress();
    }
    public void print(){
        System.out.println(this);
    }
    public int skill(){
        return witchkraft + transgress;
    }
    public void comparisonStudentFaculty(HogwardsStudents hogwardsStudents){
        int skillFirst = skill();
        int skillSecond = hogwardsStudents.skill();
        if (skillFirst > skillSecond){
            System.out.println("Ученик " + getFirstName() + " " + getLastName() + " лучше ученика " + hogwardsStudents.getFirstName() + " " + hogwardsStudents.getLastName());
        } else if (skillFirst < skillSecond) {
            System.out.println("Ученик " + getFirstName() + " " + getLastName() + " хуже ученика " + hogwardsStudents.getFirstName() + " " + hogwardsStudents.getLastName());
        } else {
            System.out.println("Ученик " + getFirstName() + " " + getLastName() + " имеет ту же силу,аналогично " + hogwardsStudents.getFirstName() + " " + hogwardsStudents.getLastName());


        }

    }
}
