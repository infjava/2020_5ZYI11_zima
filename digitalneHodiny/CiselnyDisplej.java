/**
 * Trieda reprezentujuca jeden ciselny displej v digitalnych hodinach.
 * Stara sa o zmenu hodnoty v zadanych hraniciach a o formatovanie
 * cisla do tvaru dvojcifernej hodnoty.
 */
public class CiselnyDisplej {
    private int hornaHranica;
    private int dolnaHranica;
    private int hodnota;
    private SegmentovyDisplej desiatky;
    private SegmentovyDisplej jednotky;
    
    /**
     * Inicializuje ciselny displej na hodnotu 0. Horna hranica sa pouzije
     * ta, co zada pouzivatel v parametri.
     * @param pthis.hornaHranica Predstavuje cislo, ktore hodnota ciselneho
     * displeja nemoze dosiahnut.
     */
    public CiselnyDisplej(int dolnaHranica, int hornaHranica) {
        this.hornaHranica = hornaHranica;
        this.dolnaHranica = dolnaHranica;
        this.hodnota = dolnaHranica;
        this.desiatky = new SegmentovyDisplej(0, 0);
        this.jednotky = new SegmentovyDisplej(45, 0);
        
        this.desiatky.zobrazCislicu(this.hodnota / 10);
        this.jednotky.zobrazCislicu(this.hodnota % 10);
    }
    
    /**
     * Vrati aktualnu hodnotu ciselneho displeja vo forme celeho cisla typu
     * int.
     */
    public int getHodnota() {
        return this.hodnota;
    }
    
    /**
     * Nastavi novu hodnotu ciselneho displeja vo forme celeho cisla typu int.
     * Kontroluje platnost zadavaneho cisla. V pripade, ze je mimo rozsah,
     * nechava povodnu hodnotu.
     * 
     * @param hodnota hodnota, ktora sa ma nastavit.
     */
    public void setHodnota(int hodnota) {
        if (hodnota >= this.dolnaHranica) {
            if (hodnota < this.hornaHranica) {
                this.hodnota = hodnota;
                
                this.desiatky.zobrazCislicu(this.hodnota / 10);
                this.jednotky.zobrazCislicu(this.hodnota % 10);
            }
        }
    }
    
    /**
     * Vrati hodnotu ciselneho displeja vo forme retazca, pricom hodnota je
     * vzdy vo forme dvojciferneho cisla s pripadnou uvodnou nulou.
     */
    public String getHodnotaAkoRetazec() {
        if (this.hodnota < 10) {
            return "0" + this.hodnota;
        } else {
            return "" + this.hodnota;
        }
    }
    
    /**
     * Zvacsi hodnotu na ciselnom displeji o hodnotu jedna. Ak dosiahne hornu
     * hranicu, pokracuje znovu od nuly.
     */
    public void krok() {
        this.hodnota = this.hodnota + 1;
        if (this.hodnota == this.hornaHranica) {
            this.hodnota = this.dolnaHranica;
        }
        
        this.desiatky.zobrazCislicu(this.hodnota / 10);
        this.jednotky.zobrazCislicu(this.hodnota % 10);
    }
}
