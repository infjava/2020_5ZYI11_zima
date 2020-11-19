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
}
