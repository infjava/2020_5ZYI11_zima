public class Lopta {
    private Kruh zobrazenie;
    private String smer;
    
    public Lopta() {
        this.zobrazenie = new Kruh();
        
        this.zobrazenie.zmenPriemer(10);
        
        this.zobrazenie.posunVodorovne(125);
        this.zobrazenie.posunZvisle(85);
        
        this.zobrazenie.zobraz();
        
        this.smer = "PH";
    }
    
    public void posun() {
        this.zobrazenie.skry();
        
        switch (this.smer) {
            case "PH":
                this.zobrazenie.posunZvisle(-5);
                this.zobrazenie.posunVodorovne(5);
                break;
            case "P":
                this.zobrazenie.posunVodorovne(5);
                break;
            case "PD":
                this.zobrazenie.posunZvisle(5);
                this.zobrazenie.posunVodorovne(5);
                break;
            case "LH":
                this.zobrazenie.posunZvisle(-5);
                this.zobrazenie.posunVodorovne(-5);
                break;
            case "L":
                this.zobrazenie.posunVodorovne(-5);
                break;
            case "LD":
                this.zobrazenie.posunZvisle(5);
                this.zobrazenie.posunVodorovne(-5);
                break;
        }
        
        this.zobrazenie.zobraz();
    }
}
