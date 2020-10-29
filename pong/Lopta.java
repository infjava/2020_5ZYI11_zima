import java.util.Random;

public class Lopta {
    private Kruh zobrazenie;
    private int smerX;
    private int smerY;
    
    public Lopta() {
        Random nahodneCisla = new Random();
        
        this.zobrazenie = new Kruh();
        
        this.zobrazenie.zmenPriemer(10);
        
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(85);
        
        this.zobrazenie.zobraz();
        
        this.smerX = 1;
        this.smerY = -1;
    }
    
    public void tik() {
        this.zobrazenie.skry();
        
        this.zobrazenie.posunVodorovne(this.smerX * 5);
        this.zobrazenie.posunZvisle(this.smerY * 5);
        
        this.zobrazenie.zobraz();
    }
}
