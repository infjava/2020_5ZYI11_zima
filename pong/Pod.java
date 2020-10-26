public class Pod {
    private Obdlznik zobrazenie;
    
    public Pod(boolean jeLavy) {
        this.zobrazenie = new Obdlznik();
        
        this.zobrazenie.zmenStrany(10, 50);
        
        this.zobrazenie.posunVodorovne(-60);
        this.zobrazenie.posunZvisle(75);
        
        if (!jeLavy) {
            this.zobrazenie.posunVodorovne(290);
        }
        
        this.zobrazenie.zobraz();
    }
}
