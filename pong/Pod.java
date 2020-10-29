public class Pod {
    private Obdlznik zobrazenie;
    private int poziciaY;
    
    public Pod(boolean jeLavy) {
        this.zobrazenie = new Obdlznik();
        
        this.zobrazenie.zmenStrany(10, 50);
        
        this.zobrazenie.posunVodorovne(-60);
        this.zobrazenie.posunZvisle(75);
        
        this.poziciaY = 125;
        
        if (!jeLavy) {
            this.zobrazenie.posunVodorovne(290);
        }
        
        this.zobrazenie.zobraz();
    }
    
    public void posunDole() {
        if (this.poziciaY < 250) {
            this.zobrazenie.posunZvisle(10);
            this.poziciaY = this.poziciaY + 10;
        }
    }
    
    public void posunHore() {
        if (this.poziciaY > 0) {
            this.zobrazenie.posunZvisle(-10);
            this.poziciaY = this.poziciaY - 10;
        }
    }
}
