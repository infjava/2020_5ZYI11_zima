public class Nim {
    private Sachovnica sachovnica;
    private Kamen kamen;
    
    private int kamenRiadok;
    private int kamenStlpec;
    
    private String[] menaHracov;
    
    private int indexHracaNaTahu;

    public Nim(int sirkaSachovnice, int vyskaSachovnice, String prvyHrac, String druhyHrac) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = this.sachovnica.pridajKamen();
        this.sachovnica.zobraz();
        
        this.kamenRiadok = vyskaSachovnice;
        this.kamenStlpec = sirkaSachovnice;
        
        this.menaHracov = new String[] {prvyHrac, druhyHrac};
        
        this.indexHracaNaTahu = 0;
    }
    
    public String getHracNaTahu() {
        return this.menaHracov[this.indexHracaNaTahu];
    }
    
    public void posunDole(int pocetPolicok) {
        if (pocetPolicok <= 0) {
            return;
        }
        
        int novyRiadok = this.kamenRiadok - pocetPolicok;
        
        if (novyRiadok < 1) {
            return;
        }
        
        this.kamen.posun(novyRiadok, this.kamenStlpec);
        
        this.kamenRiadok = novyRiadok;
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
    }
    
    public void posunVlavo(int pocetPolicok) {
        if (pocetPolicok <= 0) {
            return;
        }
        
        int novyStlpec = this.kamenStlpec - pocetPolicok;
        
        if (novyStlpec < 1) {
            return;
        }
        
        this.kamen.posun(this.kamenRiadok, novyStlpec);
        
        this.kamenStlpec = novyStlpec;
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
    }
}
