public class Sachovnica {
    private Stvorec[][] policka;
    
    public Sachovnica(int sirka, int vyska) {
        this.policka = new Stvorec[vyska][sirka];
        
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
                this.policka[riadok][stlpec] = policko;
            }
        }
    }
    
    public void zobraz() {
        for (Stvorec[] riadok : this.policka) {
            for (Stvorec policko : riadok) {
                policko.zobraz();
            }
        }
    }
    
    public void skry() {
        for (Stvorec[] riadok : this.policka) {
            for (Stvorec policko : riadok) {
                policko.skry();
            }
        }
    }
}
