public class Gryffindor extends Hogwards {

    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int witchkraft, int transgress, int nobility, int honour, int bravery) {
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
}
