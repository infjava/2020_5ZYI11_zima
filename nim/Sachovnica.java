public class Sachovnica {
    public Sachovnica(int sirka, int vyska) {
        for (int riadok = 0; riadok < vyska; riadok++) {
            for (int stlpec = 0; stlpec < sirka; stlpec++) {
                Stvorec policko = new Stvorec();
                policko.zmenStranu(15);
                policko.posunVodorovne(stlpec * 15 - 60);
                policko.posunZvisle(riadok * 15 - 50);
                if ((vyska % 2 == 0 && sirka % 2 == 0) || (vyska % 2 == 0 && sirka % 2 != 0)) {
                    if ((riadok + stlpec) % 2 != 0) {
                        policko.zmenFarbu("black");
                    } else {
                        policko.zmenFarbu("white");
                    }
                } else {
                    if ((riadok + stlpec) % 2 == 0) {
                        policko.zmenFarbu("black");
                    } else {
                        policko.zmenFarbu("white");
                    }
                }
                policko.zobraz();
            }
        }
    }
}
