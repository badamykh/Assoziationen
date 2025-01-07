public class Garten {
    private Kind k1;
    private Kind k2;

    public Garten(){
        this.k1 = null;
        this.k2 = null;
    }
    public void createYourKind(){
        if (k1 == null) {
            this.k1 = new Kind();
        } else {
            if (k2 == null) {
                this.k2 = new Kind();
            }
        }
    }
}
