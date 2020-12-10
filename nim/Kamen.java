public class Kamen {
    private Kruh kamen;
    
    private int poziciaRiadok;
    private int poziciaStlpec;
    
    public Kamen(Sachovnica sachovnica) {
        this.poziciaRiadok = sachovnica.getVyska();
        this.poziciaStlpec = sachovnica.getSirka();
        
        this.kamen = new Kruh();
        this.kamen.zmenPriemer(Sachovnica.VELKOST_POLICKA - 2);
        this.kamen.posunVodorovne(-19 + (sachovnica.getSirka() - 1) * Sachovnica.VELKOST_POLICKA);
        this.kamen.posunZvisle(-59);
    }
    
    public void zobraz() {
        this.kamen.zobraz();
    }
    
    public void skry() {
        this.kamen.skry();
    }
    
    public void posun(int novyRiadok, int novyStlpec) {
        int posunStlpce = novyStlpec - this.poziciaStlpec;
        int posunRiadky = novyRiadok - this.poziciaRiadok;
        
        this.kamen.skry();
        this.kamen.posunVodorovne(posunStlpce * Sachovnica.VELKOST_POLICKA);
        this.kamen.posunZvisle(-posunRiadky * Sachovnica.VELKOST_POLICKA);
        this.kamen.zobraz();
        
        this.poziciaRiadok = novyRiadok;
        this.poziciaStlpec = novyStlpec;
    }
}
