public class Nim {
    private Sachovnica sachovnica;
    private Kamen kamen;
    
    private int kamenRiadok;
    private int kamenStlpec;
    
    private String hracNaTahu;
    private String prvyHrac;
    private String druhyHrac;

    public Nim(int sirkaSachovnice, int vyskaSachovnice, String prvyHrac, String druhyHrac) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = this.sachovnica.pridajKamen();
        this.sachovnica.zobraz();
        
        this.kamenRiadok = vyskaSachovnice;
        this.kamenStlpec = sirkaSachovnice;
        
        this.hracNaTahu = prvyHrac;
        this.prvyHrac = prvyHrac;
        this.druhyHrac = druhyHrac;
    }
    
    public String getHracNaTahu() {
        return this.hracNaTahu;
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
        
        if (this.hracNaTahu.equals(this.prvyHrac)) {
            this.hracNaTahu = this.druhyHrac;
        } else {
            this.hracNaTahu = this.prvyHrac;
        }
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
        
        if (this.hracNaTahu.equals(this.prvyHrac)) {
            this.hracNaTahu = this.druhyHrac;
        } else {
            this.hracNaTahu = this.prvyHrac;
        }
    }
}
