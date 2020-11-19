public class Dvere {
    private boolean obsahujuVyhru;
    private boolean otvorene;
    private boolean vybrane;
    
    public Dvere(boolean obsahujuVyhru) {
        this.obsahujuVyhru = obsahujuVyhru;
        this.otvorene = false;
        this.vybrane = false;
    }
    
    public void vyber() {
        this.vybrane = true;
    }
    
    public void zrusVyber() {
        this.vybrane = false;
    }
}
