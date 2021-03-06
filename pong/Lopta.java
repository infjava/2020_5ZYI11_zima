import java.util.Random;

public class Lopta {
    private Kruh zobrazenie;
    
    private int smerX;
    private int smerY;
    
    private int poziciaY;
    private int poziciaX;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        
        this.zobrazenie = new Kruh();
        
        this.zobrazenie.zmenPriemer(10);
        
        // nahodne cislo z intervalu <25, 275>
        this.poziciaY = nahodneCisla.nextInt(251) + 25;
        this.poziciaX = 150;
        
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(this.poziciaY - 65);
        
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
    
    public void posun() {
        this.zobrazenie.skry();
        
        if (this.poziciaY > 295 || this.poziciaY < 5) {
            this.smerY = -this.smerY;
        }
        
        this.zobrazenie.posunVodorovne(this.smerX * 5);
        this.zobrazenie.posunZvisle(this.smerY * 5);
        
        this.poziciaX += this.smerX * 5;
        this.poziciaY += this.smerY * 5;
        
        this.zobrazenie.zobraz();
    }
    
    public int getStredX() {
        return this.poziciaX;
    }
    
    public int getStredY() {
        return this.poziciaY;
    }
    
    public void odrazSaOdPodu() {
        this.smerX = -this.smerX;
    }
    
    public boolean jeMimoObrazovky() {
        return this.poziciaX < 0 || this.poziciaX > 300;
    }
    
    public void umiestniNanovo() {
        Random nahodneCisla = new Random();
        
        int novaPoziciaY = nahodneCisla.nextInt(251) + 25;
        int novaPoziciaX = 150;
        
        this.zobrazenie.posunVodorovne(novaPoziciaX - this.poziciaX);
        this.zobrazenie.posunZvisle(novaPoziciaY - this.poziciaY);
        
        this.poziciaX = novaPoziciaX;
        this.poziciaY = novaPoziciaY;
        
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
}
