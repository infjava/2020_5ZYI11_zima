import java.util.Random;

public class Nim {
    private Sachovnica sachovnica;
    private Kamen kamen;
    
    private int kamenRiadok;
    private int kamenStlpec;
    
    private String[] menaHracov;
    
    private int indexHracaNaTahu;
    
    private String vyherca;

    public Nim(int sirkaSachovnice, int vyskaSachovnice, String prvyHrac, String druhyHrac) {
        this.sachovnica = new Sachovnica(sirkaSachovnice, vyskaSachovnice);
        this.kamen = this.sachovnica.pridajKamen();
        this.sachovnica.zobraz();
        
        this.kamenRiadok = vyskaSachovnice;
        this.kamenStlpec = sirkaSachovnice;
        
        this.menaHracov = new String[] {prvyHrac, druhyHrac};
        
        this.indexHracaNaTahu = 0;
        
        this.vyherca = null;
        
        if (this.getHracNaTahu().equals("PC")) {
            this.tahPC();
        }
    }
    
    public String getVyherca() {
        return this.vyherca;
    }
    
    public String getHracNaTahu() {
        return this.menaHracov[this.indexHracaNaTahu];
    }
    
    public void posunDole(int pocetPolicok) {
        this.posun(pocetPolicok, 0);
    }
    
    public void posunVlavo(int pocetPolicok) {
        this.posun(0, pocetPolicok);
    }
        
    private void posun(int pocetPolicokDole, int pocetPolicokVlavo) {
        if (pocetPolicokDole <= 0 && pocetPolicokVlavo <= 0) {
            return;
        }
        
        int novyRiadok = this.kamenRiadok - pocetPolicokDole;
        int novyStlpec = this.kamenStlpec - pocetPolicokVlavo;
        
        if (novyRiadok < 1) {
            return;
        }
        
        if (novyStlpec < 1) {
            return;
        }
        
        this.kamen.posun(novyRiadok, novyStlpec);
        
        this.kamenRiadok = novyRiadok;
        this.kamenStlpec = novyStlpec;
        
        if (this.kamenRiadok == 1 && this.kamenStlpec == 1) {
            this.vyherca = this.getHracNaTahu();
        }
        
        this.indexHracaNaTahu = (this.indexHracaNaTahu + 1) % this.menaHracov.length;
        
        if (this.getHracNaTahu().equals("PC") && this.vyherca == null) {
            this.tahPC();
        }
    }
    
    private void tahPC() {
        if (this.kamenStlpec > this.kamenRiadok) {
            this.posunVlavo(this.kamenStlpec - this.kamenRiadok);
        } else if (this.kamenStlpec < this.kamenRiadok) {
            this.posunDole(this.kamenRiadok - this.kamenStlpec);
        } else {
            Random nahodneCisla = new Random();
            if (nahodneCisla.nextBoolean()) {
                this.posunVlavo(nahodneCisla.nextInt(this.kamenStlpec - 1) + 1);
            } else {
                this.posunDole(nahodneCisla.nextInt(this.kamenRiadok - 1) + 1);
            }
        }
    }
}
