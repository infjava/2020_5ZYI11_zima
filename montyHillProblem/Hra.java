import java.util.Random;

public class Hra {
    private Dvere[] dvere;
    
    public Hra() {
        Random nahodneCisla = new Random();
        
        this.dvere = new Dvere[3];
        
        int cisloVyhernychDveri = nahodneCisla.nextInt(3);
        
        for (int i = 0; i < 3; i++) {
            this.dvere[i] = new Dvere(i == cisloVyhernychDveri);
        }
    }
    
    public void vyberDvere(int poradoveCislo) {
        if (poradoveCislo < 0 || poradoveCislo >= 3) {
            return;
        }
        
        for (Dvere aktualne : this.dvere) {
            aktualne.zrusVyber();
        }
        
        this.dvere[poradoveCislo].vyber();
    }
    
    public boolean dvereSaDajuOtvorit(int poradoveCislo) {
        if (poradoveCislo < 0 || poradoveCislo >= 3) {
            return false;
        }
        
        return this.dvere[poradoveCislo].dajuSaOtvorit();
    }
    
    public void otvorDvere(int poradoveCislo) {
        if (poradoveCislo < 0 || poradoveCislo >= 3) {
            return;
        }
        
        this.dvere[poradoveCislo].otvor();
    }
    
    public boolean dvereSaDajuVybrat(int poradoveCislo) {
        if (poradoveCislo < 0 || poradoveCislo >= 3) {
            return false;
        }
        
        return this.dvere[poradoveCislo].dajuSaVybrat();
    }
    
    public boolean jeVyhra() {
        for (Dvere aktualne : this.dvere) {
            if (aktualne.predstavujuVyhru()) {
                return true;
            }
        }
        
        return false;
    }
}
