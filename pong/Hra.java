public class Hra {
    private Pod podLavy;
    private Pod podPravy;
    private Lopta lopta;
    private Manazer manazer;
    private Score scoreLavy;
    private Score scorePravy;
    
    public Hra() {
        this.podLavy = new Pod(true);
        this.podPravy = new Pod(false);
        this.lopta = new Lopta();
        this.manazer = new Manazer();
        this.scoreLavy = new Score(true);
        this.scorePravy = new Score(false);
    }
    
    public void spusti() {
        this.manazer.spravujObjekt(this);
    }
    
    public void tik() {
        this.lopta.posun();
        
        if (this.podLavy.koliduje(this.lopta) || this.podPravy.koliduje(this.lopta)) {
            this.lopta.odrazSaOdPodu();
        }
        
        if (this.lopta.jeMimoObrazovky()) {
            if (this.lopta.getStredX() > 0) {
                this.scoreLavy.zvys();
            } else {
                this.scorePravy.zvys();
            }
            
            this.lopta.umiestniNanovo();
        }
    }
    
    public void posunDole() {
        this.podPravy.posunDole();
    }
    
    public void posunHore() {
        this.podPravy.posunHore();
    }
    
    public void posunVpravo() {
        this.podLavy.posunDole();
    }
    
    public void posunVlavo() {
        this.podLavy.posunHore();
    }
    
    public void zrus() {
        System.exit(0);
    }
}
