public class Pod {
    private Obdlznik zobrazenie;
    
    private int poziciaY;
    private int poziciaX;
    
    public Pod(boolean jeLavy) {
        this.zobrazenie = new Obdlznik();
        
        this.zobrazenie.zmenStrany(10, 50);
        
        this.zobrazenie.posunVodorovne(-60);
        this.zobrazenie.posunZvisle(75);
        
        this.poziciaY = 125;
        
        if (jeLavy) {
            this.poziciaX = 0;
        } else {
            this.zobrazenie.posunVodorovne(290);
            this.poziciaX = 290;
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
    
    public boolean koliduje(Lopta lopta) {
        int padXL = this.poziciaX;
        int padXP = this.poziciaX + 10;
        int loptaXL = lopta.getStredX() - 5;
        int loptaXP = lopta.getStredX() + 5;
        int padYH = this.poziciaY;
        int padYD = this.poziciaY + 50;
        int loptaYH = lopta.getStredY() - 5;
        int loptaYD = lopta.getStredY() + 5;
        
        if ((padXL <= loptaXP && loptaXP <= padXP) || (padXL <= loptaXL && loptaXL <= padXP)) {
            if ((padYH <= loptaYH && loptaYH <= padYD) || (padYH <= loptaYD && loptaYD <= padYD)) {
                return true;
            }
        }
        
        return false;
    }
}
