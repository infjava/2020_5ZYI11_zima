public class Nim {
    private Sachovnica sachovnica;
    private Kamen kamen;
    
    private int kamenRiadok;
    private int kamenStlpec;
    
    private String prvyHrac;
    private String druhyHrac;
    
    private boolean prvyNaTahu;

    public Nim(int sirkaSachovnice, int vyskaSachovnice, String prvyHrac, String druhyHrac) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = this.sachovnica.pridajKamen();
        this.sachovnica.zobraz();
        
        this.kamenRiadok = vyskaSachovnice;
        this.kamenStlpec = sirkaSachovnice;
        
        this.prvyHrac = prvyHrac;
        this.druhyHrac = druhyHrac;
        
        this.prvyNaTahu = true;
    }
    
    public String getHracNaTahu() {
        if (this.prvyNaTahu) {
            return this.prvyHrac;
        } else {
            return this.druhyHrac;
        }
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
        
        this.prvyNaTahu = !this.prvyNaTahu;
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
        
        this.prvyNaTahu = !this.prvyNaTahu;
    }
}
