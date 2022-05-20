public class Puffendy extends Hogwards{

    private int industriousness;
    private int loyalty;
    private int honour;

    public Puffendy(String firstName, String lastName, int witchkraft, int transgress, int industriousness, int loyalty, int honour) {
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
}
