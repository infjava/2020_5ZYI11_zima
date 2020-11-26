import java.util.ArrayList;

public class Sachovnica {
    private ArrayList<Stvorec> policka;
    private ArrayList<Kamen> kamene;
    
    private int sirka;
    private int vyska;
    
    public Sachovnica(int sirka, int vyska) {
        this.policka = new ArrayList<Stvorec>();
        
        this.kamene = new ArrayList<Kamen>();
        
        this.sirka = sirka;
        this.vyska = vyska;
        
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(15);
                policko.posunVodorovne(stlpec * 15 - 60);
                policko.posunZvisle(riadok * 15 - 50);
                if ((riadok + stlpec) % 2 != vyska % 2) {
                    policko.zmenFarbu("black");
                } else {
                    policko.zmenFarbu("white");
                }
                this.policka.add(policko);
            }
        }
    }
    
    public Kamen pridajKamen() {
        Kamen kamen = new Kamen(this);
        this.kamene.add(kamen);
        return kamen;
    }
    
    public void zobraz() {
        for (Stvorec policko : this.policka) {
            policko.zobraz();
        }
        
        for (Kamen kamen : this.kamene) {
            kamen.zobraz();
        }
    }
    
    public void skry() {
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
        
        for (Kamen kamen : this.kamene) {
            kamen.skry();
        }
    }
    
    public int getSirka() {
        return this.sirka;
    }
    
    public int getVyska() {
        return this.vyska;
    }
}
