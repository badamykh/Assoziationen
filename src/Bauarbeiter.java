public class Bauarbeiter {
    private Haus haus1;
    private Haus haus2;

    public Bauarbeiter() {
        this.haus1 = null;
        this.haus2 = null;
    }

    public void createYourHaus(){
        if (haus1 == null) {
            this.haus1 = new Haus();
        } else {
            if (haus2 == null) {
                this.haus2 = new Haus();
            }
        }
    }
}
