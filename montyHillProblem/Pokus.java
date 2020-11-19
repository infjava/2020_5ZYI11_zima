import java.util.Random;

public class Pokus {
    private boolean hracMeniRozhodnutie;
    private Hra hra;
    
    public Pokus(boolean hracMeniRozhodnutie) {
        this.hracMeniRozhodnutie = hracMeniRozhodnutie;
        this.hra = new Hra();
    }
    
    public void vykonaj() {
        Random nahodneCisla = new Random();
        
        this.hra.vyberDvere(nahodneCisla.nextInt(3));
        
        int dvere;
        do {
            dvere = nahodneCisla.nextInt(3);
        } while (!this.hra.dvereSaDajuOtvorit(dvere));
        
        this.hra.otvorDvere(dvere);
        
        if (this.hracMeniRozhodnutie) {
            do {
                dvere = nahodneCisla.nextInt(3);
            } while (!this.hra.dvereSaDajuVybrat(dvere));
            
            this.hra.vyberDvere(dvere);
        }
    }
    
    public boolean jeVyhra() {
        return this.hra.jeVyhra();
    }
}
