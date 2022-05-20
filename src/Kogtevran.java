public class Kogtevran extends Hogwards{

    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public Kogtevran(String firstName, String lastName, int witchkraft, int transgress, int mind, int wisdom, int wit, int creative) {
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
}
