public class Chef {
    private Personal pers01;
    private Personal pers02;
    public Chef() {
        this.pers01 = null;
        this.pers02 = null;
    }
    public void neuesPersonal(Personal einP) {
        if (this.pers01 == null) {
            this.pers01 = einP;
        } else {
            if (this.pers02 == null) {
                this.pers02 = einP;
            }
        }
    }
}
