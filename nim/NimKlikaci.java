public class NimKlikaci {
    private Nim hra;
    private int vyskaSachovnice;
    
    public NimKlikaci(int sirkaSachovnice, int vyskaSachovnice, String prvyHrac, String druhyHrac) {
        this.hra = new Nim(sirkaSachovnice, vyskaSachovnice, prvyHrac, druhyHrac);
        
        this.vyskaSachovnice = vyskaSachovnice;
        
        Manazer manazer = new Manazer();
        manazer.spravujObjekt(this);
        
        System.out.format("Na tahu je: %s%n", this.hra.getHracNaTahu());
    }
    
    public void vyberSuradnice(int x, int y) {
        int cisloStlpca = x / 15 + 1;
        int cisloRiadku = this.vyskaSachovnice - y / 15;
        
        int rozdielStlpca = this.hra.getKamenStlpec() - cisloStlpca;
        int rozdielRiadku = this.hra.getKamenRiadok() - cisloRiadku;
        
        if (rozdielStlpca == 0) {
            this.hra.posunDole(rozdielRiadku);
        } else if (rozdielRiadku == 0) {
            this.hra.posunVlavo(rozdielStlpca);
        } else if (rozdielRiadku == rozdielStlpca) {
            this.hra.posunSikmo(rozdielRiadku);
        }
        
        if (this.hra.getVyherca() == null) {
            System.out.format("Na tahu je: %s%n", this.hra.getHracNaTahu());
        } else {
            System.out.format("Koniec, hru vyhral: %s%n", this.hra.getVyherca());
        }
    }
    
    public void zrus() {
        System.exit(0);
    }
}
