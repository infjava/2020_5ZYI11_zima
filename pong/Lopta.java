public class Lopta {
    private Kruh zobrazenie;
    private int smer;
    
    public Lopta() {
        this.zobrazenie = new Kruh();
        
        this.zobrazenie.zmenPriemer(10);
        
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(85);
        
        this.zobrazenie.zobraz();
        
        this.smer = 0;
    }
    
    public void posun() {
        switch (this.smer) {
            case 0:
                this.zobrazenie.posunZvisle(-5);
                this.zobrazenie.posunVodorovne(5);
                break;
            case 1:
                this.zobrazenie.posunVodorovne(5);
                break;
            case 2:
                this.zobrazenie.posunZvisle(5);
                this.zobrazenie.posunVodorovne(5);
                break;
            case 3:
                this.zobrazenie.posunZvisle(-5);
                this.zobrazenie.posunVodorovne(-5);
                break;
            case 4:
                this.zobrazenie.posunVodorovne(-5);
                break;
            case 5:
                this.zobrazenie.posunZvisle(5);
                this.zobrazenie.posunVodorovne(-5);
                break;
        }
    }
}
