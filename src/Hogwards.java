public class Hogwards {
    private String firstName;
    private String lastName;
    private int witchkraft;
    private int transgress;

    public Hogwards(String firstName, String lastName, int witchkraft, int transgress) {
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
}
