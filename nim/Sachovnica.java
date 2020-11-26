public class Sachovnica {
    private Stvorec[] policka;
    
    public Sachovnica(int sirka, int vyska) {
        this.policka = new Stvorec[vyska * sirka];
        
        int index = 0;
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
                this.policka[index] = policko;
                index++;
            }
        }
    }
    
    public void zobraz() {
        for (Stvorec policko : this.policka) {
            policko.zobraz();
        }
    }
    
    public void skry() {
        for (Stvorec policko : this.policka) {
            policko.skry();
        }
    }
}
