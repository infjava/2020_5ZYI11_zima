import java.util.Random;

public class Lopta {
    private Kruh zobrazenie;
    private int smerX;
    private int smerY;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        
        this.zobrazenie = new Kruh();
        
        this.zobrazenie.zmenPriemer(10);
        
        // nahodne cislo z intervalu <25, 275>
        int poziciaY = nahodneCisla.nextInt(251) + 25;
        
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(poziciaY - 65);
        
        this.zobrazenie.zobraz();
        
        if (nahodneCisla.nextBoolean()) {
            this.smerX = 1;
        } else {
            this.smerX = -1;
        }
        
        if (nahodneCisla.nextBoolean()) {
            this.smerY = 1;
        } else {
            this.smerY = -1;
        }
    }
    
    public void tik() {
        this.zobrazenie.skry();
        
        this.zobrazenie.posunVodorovne(this.smerX * 5);
        this.zobrazenie.posunZvisle(this.smerY * 5);
        
        this.zobrazenie.zobraz();
    }
}
