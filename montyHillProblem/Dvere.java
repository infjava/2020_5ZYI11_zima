public class Dvere {
    private boolean obsahujuVyhru;
    private boolean otvorene;
    private boolean vybrane;
    
    public Dvere(boolean obsahujuVyhru) {
        this.obsahujuVyhru = obsahujuVyhru;
        this.otvorene = false;
        this.vybrane = false;
    }
        
    public boolean dajuSaVybrat() {
        return !this.otvorene && !this.vybrane;
    }

    public void vyber() {
        if (this.otvorene) {
            return;
        }
        
        this.vybrane = true;
    }
    
    public void zrusVyber() {
        this.vybrane = false;
    }
    
    public boolean dajuSaOtvorit() {
        return !this.obsahujuVyhru && !this.vybrane;
    }
    
    public void otvor() {
        if (this.obsahujuVyhru) {
            return;
        }
        
        if (this.vybrane) {
            return;
        }
        
        this.otvorene = true;
    }
    
    public boolean predstavujuVyhru() {
        return this.vybrane && this.obsahujuVyhru;
    }
}
